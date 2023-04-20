package com.test.jdatest.userservice;

import java.time.LocalDate;

public class User {

    private Integer id;
    private String name;
    private LocalDate birthdate;

    public User(Integer id, String name, LocalDate dob) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = dob;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.test.jdatest.userservice.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}

