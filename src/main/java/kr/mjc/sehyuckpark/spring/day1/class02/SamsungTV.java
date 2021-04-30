package kr.mjc.sehyuckpark.spring.day1.class02;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

    public SamsungTV() {
        System.out.println("SamsungTV is created.");
    }
}
