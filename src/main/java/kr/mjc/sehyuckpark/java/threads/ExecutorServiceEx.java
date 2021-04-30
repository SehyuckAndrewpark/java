package kr.mjc.sehyuckpark.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        RestRoom restRoom = new RestRoom();
        Runnable r = () -> restRoom.use();

        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(r);
        service.execute(r);
        service.execute(r);
        service.execute(r);

        service.shutdown();
    }
}
