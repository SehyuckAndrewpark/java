package kr.mjc.sehyuckpark.spring.day1.class03.lifecycle;

import kr.mjc.sehyuckpark.spring.day1.class02.SamsungTV;

public class SamsungTVWithLifeCycleCallbacks extends SamsungTV {

    public void init() {
        System.out.println("samsungTV is initialized.");
    }

    public void close() {
        System.out.println("samsungTV is destroyed.");
    }
}
