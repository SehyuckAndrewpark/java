package kr.mjc.sehyuckpark.spring.day1.class02;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    Map<String, Object> map = new HashMap<>();

    public BeanFactory() {
        map.put("samsung", new SamsungTV());
        map.put("lg", new LgTV());
        System.out.println("beanFactory Made Beans.");
    }

    public Object getBean(String name) {
        return map.get(name);
    }
}