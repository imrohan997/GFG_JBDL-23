package com.geeksforgeeks;

public class Customer implements Comparable<Customer> {
    private int custId;
    private String name;
    private String gender;
    private int age;

    public Customer(int custId, String name, String gender, int age) {
        this.custId = custId;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + this.getCustId() + "," + this.getName() + "," + this.getAge() + "," + this.getGender() + "]";
    }

    @Override
    public int compareTo(Customer o) {
        return this.getCustId() - o.getCustId();
    }
}
