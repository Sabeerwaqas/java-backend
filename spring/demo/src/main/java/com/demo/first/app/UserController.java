package com.demo.first.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Map<Integer, User> userDb = new HashMap<>();

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userDb.putIfAbsent(user.getId(), user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User Created");
    }

    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody User user) {

        if (!userDb.containsKey(user.getId())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        userDb.put(user.getId(), user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User Updated Successfully!");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {

        if (!userDb.containsKey(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

        userDb.remove(id);
        return ResponseEntity.status(HttpStatus.CREATED).body("User deleted successfully");
    }

    @GetMapping
    public List<User> getUsers() {
        return new ArrayList<>(userDb.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        if(!userDb.containsKey(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(userDb.get(id));
    }

}
