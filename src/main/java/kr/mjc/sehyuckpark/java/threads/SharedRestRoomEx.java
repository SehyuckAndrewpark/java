package kr.mjc.sehyuckpark.java.threads;

public class SharedRestRoomEx {
    public static void main(String[] args) {
        RestRoom restRoom = new RestRoom();

        Runnable r = () -> restRoom.use();

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
