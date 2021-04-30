package kr.mjc.sehyuckpark.spring.day1.class03;

import kr.mjc.sehyuckpark.spring.day1.class02.LgTV;
import kr.mjc.sehyuckpark.spring.day1.class02.SamsungTV;
import kr.mjc.sehyuckpark.spring.day1.class02.TV;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVUserUsingJavaBasedConfiguration {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        TV samsungTV = context.getBean(SamsungTV.class);
        samsungTV.powerOn();
        samsungTV.powerOff();

        TV lgTV = context.getBean(LgTV.class);
        lgTV.powerOn();
        lgTV.powerOff();
    }
}
