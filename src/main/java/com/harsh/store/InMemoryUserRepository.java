package com.harsh.store;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{
    HashMap<String, User> users = new HashMap<>();
    @Override
    public void save(User user) {
        if(!users.containsKey(user.getEmail())){
            users.put(user.getEmail(), user);
        }else{
            throw new IllegalArgumentException("User with this email already exists");
        }
    }
}
