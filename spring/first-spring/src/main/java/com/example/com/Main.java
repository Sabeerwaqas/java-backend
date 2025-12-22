package com.example.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingsService greetingsService = (GreetingsService) context.getBean("myBean");
        greetingsService.sayHello();
    }
}
