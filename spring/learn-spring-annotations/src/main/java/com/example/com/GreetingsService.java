package com.example.com;

import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingsService {
    public void sayHello(){
        System.out.println("Hello From Spring!");
    }
}
