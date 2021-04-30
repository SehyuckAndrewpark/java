package kr.mjc.sehyuckpark.spring.day1.class02;

import java.util.Scanner;

public class TVUserUsingFactory {

    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory(); // made bean

        System.out.print("Input bean's name : ");

        // try-with-resources
        // AutoCloseable interface class close()
        // finally & scanner.close(); same result
        try (Scanner scanner = new Scanner(System.in)) {
            String beanName = scanner.next();
            TV tv = (TV) factory.getBean(beanName);
            tv.powerOn();
        }
    }
}