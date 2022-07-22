package com.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation
        .AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.genspark.model")
public class AppConfig {

    public static void main(String[] args) {
        ApplicationContext appContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String beanName : appContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

}
