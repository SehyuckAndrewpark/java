package kr.mjc.sehyuckpark.spring.day1.class02;

public class TVUser {

    public static void main(String[] args) {

        TV tv = new LgTV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
