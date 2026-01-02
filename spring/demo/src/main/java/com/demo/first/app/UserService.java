package com.demo.first.app;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final Map<Integer, User> userDb = new HashMap<>();

    public User createUser(User user) {
        userDb.putIfAbsent(user.getId(), user);
        return user;
    }

    public User updateUser(User user) {
        if (!userDb.containsKey(user.getId())) {
            throw new IllegalArgumentException("User with id: " + user.getId() + " not found");
        }
        userDb.put(user.getId(), user);
        return user;
    }

    public boolean deleteUser(int id) {
        return userDb.remove(id) != null;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userDb.values());
    }

    public User getUserById(int id) {
        return userDb.get(id);
    }

    public List<User> searchUsersByName(String name) {
        return userDb.values().stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
