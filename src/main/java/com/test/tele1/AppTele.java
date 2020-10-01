package com.test.tele1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class AppTele
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext run = SpringApplication.run(AppTele.class, args);


        String[] beanNames = run.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
