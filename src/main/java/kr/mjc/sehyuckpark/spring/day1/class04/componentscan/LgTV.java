package kr.mjc.sehyuckpark.spring.day1.class04.componentscan;

import kr.mjc.sehyuckpark.spring.day1.class02.TV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * p.69
 */
@Component
public class LgTV implements TV {

    private Speaker speaker = null;

    /**
     * Default constructor
     */
    public LgTV() {
        System.out.println("lgTV instance is created.");
    }


    @Autowired
    public void setSpeaker(@Qualifier("appleSpeaker") Speaker speaker) {
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
