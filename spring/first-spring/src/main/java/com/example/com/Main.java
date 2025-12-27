package com.example.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        com.example.com.GreetingsService greetingsService = (com.example.com.GreetingsService) context.getBean("myBean");
        greetingsService.sayHello();
    }
}
