package kr.mjc.sehyuckpark.spring.day1.class04;

import kr.mjc.sehyuckpark.spring.day1.class02.TV;

/**
 * p.69
 */
public class SamsungTV implements TV {

    private final Speaker speaker;


    public SamsungTV(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("samsungTV get speaker at constructor.");
        System.out.println("samsungTV instance is created.");
    }

    @Override
    public void volumeUp() {
        System.out.print("samsungTV : ");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.print("samsungTV : ");
        speaker.volumeDown();
    }
}