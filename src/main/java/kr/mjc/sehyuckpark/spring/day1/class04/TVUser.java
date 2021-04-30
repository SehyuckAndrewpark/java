package kr.mjc.sehyuckpark.spring.day1.class04;

public class TVUser {

    public static void main(String[] args) {
        Speaker sonySpeaker = new SonySpeaker();
        Speaker appleSpeaker = new AppleSpeaker();

        // use constructor
        SamsungTV samsungTV = new SamsungTV(sonySpeaker);

        // default constructor, use setter
        LgTV lgTV = new LgTV();
        lgTV.setSpeaker(appleSpeaker);

        samsungTV.volumeUp();
        lgTV.volumeDown();
    }
}
