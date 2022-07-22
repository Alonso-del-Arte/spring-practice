package com.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// TODO: Add Spring Boot as a dependency
// TODO: Make this class a SpringBootApplication
public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }

}
