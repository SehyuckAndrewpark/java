package kr.mjc.sehyuckpark.spring.day1.class02;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {

    public LgTV() {
        System.out.println("LgTV is created.");
    }
}