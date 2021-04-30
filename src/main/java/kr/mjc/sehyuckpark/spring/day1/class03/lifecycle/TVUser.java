package kr.mjc.sehyuckpark.spring.day1.class03.lifecycle;

import kr.mjc.sehyuckpark.spring.day1.class02.SamsungTV;
import kr.mjc.sehyuckpark.spring.day1.class02.TV;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVUser {

    public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        TV samsungTV = context.getBean(SamsungTV.class);
        samsungTV.powerOn();
        samsungTV.powerOff();
        context.close();
    }
}