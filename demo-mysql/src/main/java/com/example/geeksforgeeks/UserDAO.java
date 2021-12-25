package com.example.geeksforgeeks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {

    private Logger logger = LoggerFactory.getLogger(UserDAO.class);
    private Connection connection;

    public UserDAO() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
        createTable();
    }

    private void createTable() throws SQLException {
        Statement statement = this.connection.createStatement();
        statement.execute("create table if not exists my_user (id int primary key auto_increment, firstName varchar(20), lastName varchar(10), age int , isSeniorCitizen bool, email varchar(30) unique)");
    }

    public void createUser(User user) throws SQLException {
        Statement statement = this.connection.createStatement();

        logger.error(user + " is user object and result is");

        boolean result = statement.execute("insert into my_user (firstName,lastName,age,isSeniorCitizen,email) " +
                "values (" + user.getFirstName() + "," + user.getLastName() + "," + user.getAge() + "," + user.isSeniorCitizen() + "," + user.getEmail() + ")");
        //logger.info(result + "result inserted");
    }


    public List<User> getUsers() throws SQLException {
        List<User> list = new ArrayList<>();
        Statement statement = this.connection.createStatement();
        ResultSet resultset = statement.executeQuery("Select * from my_user");
        while (resultset.next()) {
            int id = resultset.getInt(1);
            String firstName = resultset.getString(2);
            String lastName = resultset.getString(3);
            int age = resultset.getInt(4);
            boolean isSeniorCitizen = resultset.getBoolean(5);
            String email = resultset.getString(6);

            User user = User.builder()
                    .id(id)
                    .age(age)
                    .firstName(firstName)
                    .lastName(lastName)
                    .isSeniorCitizen(isSeniorCitizen)
                    .email(email)
                    .build();

            list.add(user);
        }
        return list;
    }

    public User getUserById(int id) throws SQLException {
        Statement statement = this.connection.createStatement();
        ResultSet resultset = statement.executeQuery("Select * from my_user where id=" + id);

        String firstName = resultset.getString(2);
        String lastName = resultset.getString(3);
        int age = resultset.getInt(4);
        boolean isSeniorCitizen = resultset.getBoolean(5);
        String email = resultset.getString(6);

        User user = User.builder()
                .id(id)
                .age(age)
                .firstName(firstName)
                .lastName(lastName)
                .isSeniorCitizen(isSeniorCitizen)
                .email(email)
                .build();

        return user;
    }

    public User deleteUserById(int id) throws SQLException {
        Statement statement = this.connection.createStatement();
        int result = statement.executeUpdate("delete from my_user where id=" + id);
        logger.info(result + " number of rows are deleted");
        return getUserById(id);
    }

    public void updateUserById(int id, User user) throws SQLException {
        Statement statement = this.connection.createStatement();
        String sql = "update my_user SET ";
        if (user.getAge() != 0) {
            sql += "age=" + user.getAge();
        }
        if (user.getEmail() != null) {
            sql += ",email=" + user.getEmail();
        }
        if (user.getFirstName() != null) {
            sql += ",firstName=" + user.getFirstName();
        }
        if (user.getLastName() != null) {
            sql += ",lastName=" + user.getLastName();
        }
        sql += " where id=" + id;

        int noOfRowsUpdated = statement.executeUpdate(sql);

        logger.info("Total number of rows updated are:" + noOfRowsUpdated);

    }


}
