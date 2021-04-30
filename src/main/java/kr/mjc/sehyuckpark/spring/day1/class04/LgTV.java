package kr.mjc.sehyuckpark.spring.day1.class04;

import kr.mjc.sehyuckpark.spring.day1.class02.TV;

/**
 * p.69
 */
public class LgTV implements TV {

    private Speaker speaker = null;

    /**
     * Default constructor
     */
    public LgTV() {
        System.out.println("lgTV instance is created.");
    }

    /**
     * speaker setter
     */
    public void setSpeaker(Speaker speaker) { // property speaker
        this.speaker = speaker;
        System.out.println("lgTV get speaker at setter.");
    }

    @Override
    public void volumeUp() {
        System.out.print("lgTV : ");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.print("lgTV : ");
        speaker.volumeDown();
    }
}
