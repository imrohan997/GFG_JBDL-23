package com.example.demoredis.controller;

import com.example.demoredis.dto.Person;
import com.example.demoredis.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class RedisController {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    private static final String KEY_PREFIX = "Person::";
    private static final String PERSON_LIST = "Person_List";
    private static final String HASH_PERSON_KEY = "PERSON_HK::";
    private static final String KEY = "KEY";

    @Autowired
    ObjectMapper objectMapper;

    // -------------------------------------Values---------------------------------

    @PostMapping("/setValue")
    public void setValue(@Valid @RequestBody Person person) {
        String key = KEY_PREFIX + person.getId();
        redisTemplate.opsForValue().set(key, person);
    }

    @GetMapping("/getValue")
    public Person getValue(@Valid @RequestParam("id") Integer id) {
        String key = KEY_PREFIX + id;
        return (Person) redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/getValues")
    public List<Person> getAllValues() {
        String pattern = KEY_PREFIX + "*";
        return redisTemplate.keys(pattern).stream().map(key -> redisTemplate.opsForValue().get(key)).map(value -> (Person) value).collect(Collectors.toList());

    }

    // -------------------------------------List------------------------------------------

    @PostMapping("/lpush")
    public void lpush(@RequestBody Person person) {
        redisTemplate.opsForList().leftPush(PERSON_LIST, person);
    }

    @PostMapping("/rpush")
    public void rpush(@RequestBody Person person) {
        redisTemplate.opsForList().rightPush(PERSON_LIST, person);
    }

    @DeleteMapping("/rpop")
    public void rpop(@RequestParam(required = false, defaultValue = "1") Integer count) {
        redisTemplate.opsForList().rightPop(PERSON_LIST, count);
    }

    @DeleteMapping("/lpop")
    public void lpop(@RequestParam(required = false, defaultValue = "1") Integer count) {
        redisTemplate.opsForList().leftPop(PERSON_LIST, count);
    }

    @GetMapping("/lrange")
    public List<Person> lrange(@RequestParam(defaultValue = "0", required = false) Integer start, @RequestParam(defaultValue = "-1", required = false) Integer end) {
        return redisTemplate.opsForList().range(PERSON_LIST, start, end).stream().map(x -> (Person) x).
                collect(Collectors.toList());
    }

    // -----------------------------Hash------------------------

    @PostMapping("/hmset")
    public void hmset(@RequestBody Person person) {
        String key = HASH_PERSON_KEY + person.getId();
        Map map = objectMapper.convertValue(person, Map.class);
        redisTemplate.opsForHash().putAll(key, map);
    }

    @GetMapping("/hmget")
    public Person hmget(@RequestParam Integer id) {
        String key = HASH_PERSON_KEY + id;
        Person person = objectMapper.convertValue(redisTemplate.opsForHash().entries(key), Person.class);
        if (person == null) {
            return null;
        }
        return person;
    }

    @DeleteMapping("/hdel")
    public boolean hdel(@RequestParam Integer id) {
        String key = HASH_PERSON_KEY + id;
        return redisTemplate.delete(key);
    }


    @PostMapping("/hset")
    public void hset(@RequestParam("key") String hashKey, @RequestParam("value") String val) {
        String key = KEY;
        redisTemplate.opsForHash().put(key, hashKey, val);
    }

    @GetMapping("/hget")
    public String hget(@RequestParam String fieldName) {
        String key = KEY;
        return redisTemplate.opsForHash().get(key, fieldName) + "";
    }

}
