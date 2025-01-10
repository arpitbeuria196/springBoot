package com.codingShuttle.arpit.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Apple {

    void eatApple()
    {
        System.out.println("I am Eating Apple");
    }

   @PostConstruct// Before bean runs
    void appEaten()
    {
        System.out.println("You Can't eat");
    }

    @PreDestroy // After destroy
    void destroy()
    {
        System.out.println("Destroying the Apple Bean");
    }
}
