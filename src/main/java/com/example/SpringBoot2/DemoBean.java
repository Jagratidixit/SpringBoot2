package com.example.SpringBoot2;


import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public String getMessage() {
        return "Hello from DemoBean!";
    }
}
