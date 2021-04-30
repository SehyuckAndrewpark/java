package kr.mjc.sehyuckpark.java.threads;

import java.util.concurrent.*;

public class SchedulerEx {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable beeper = () -> System.out.print("beep ");

        scheduler.scheduleAtFixedRate(beeper, 1, 1, TimeUnit.SECONDS);
    }
}
