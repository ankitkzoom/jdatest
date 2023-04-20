package com.test.jdatest.userservice;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDAOService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Ankit", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Puja", LocalDate.now().minusYears(32)));
        users.add(new User(3,"Nidhi", LocalDate.now().minusYears(28)));
    }

    public static List<User> findAll() {
        return users;
    }


    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
