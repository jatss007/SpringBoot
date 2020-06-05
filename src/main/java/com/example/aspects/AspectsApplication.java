package com.example.aspects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication


public class AspectsApplication {


    public static void main(String[] args) {


        ApplicationContext cur =  SpringApplication.run(AspectsApplication.class, args);

        Business b = cur.getBean(Business.class);

        b.show();


    }

}
