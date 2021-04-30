package kr.mjc.sehyuckpark.spring.day1.class03;

import kr.mjc.sehyuckpark.spring.day1.class02.LgTV;
import kr.mjc.sehyuckpark.spring.day1.class02.SamsungTV;
import kr.mjc.sehyuckpark.spring.day1.class02.TV;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUserUsingXmlBasedConfiguration {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext03.xml");

        // by-name lookup.
        // Quick find, if there's id error, can error at runtime
        TV samsungTV = context.getBean("samsungTV", SamsungTV.class);
        // TV samsungTV = (TV) context.getBean("samsungTV");
        samsungTV.powerOn();
        samsungTV.powerOff();

        // by-type lookup
        // Slow fine, can find error at compile time
        TV lgTV = context.getBean(LgTV.class);
        lgTV.powerOn();
        lgTV.powerOff();
    }
}
