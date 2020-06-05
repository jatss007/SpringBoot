package com.example.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class AspectClass {

    @Before("execution(public void show())")
    public void FirstAspect(){

        System.out.println("HELLO");

    }

    @After("execution(public void show())")
    public void SecondAspect(){

        System.out.println("Bye");

    }

}
