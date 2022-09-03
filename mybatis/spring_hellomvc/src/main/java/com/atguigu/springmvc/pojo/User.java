package com.atguigu.springmvc.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String username;
    private String password;
    private String gender;
    private Integer age;

    public User(){}

    public User(String username, String password, String gender, Integer age) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
