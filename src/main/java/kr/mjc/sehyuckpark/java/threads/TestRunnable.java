package kr.mjc.sehyuckpark.java.threads;

class TimerRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        Thread th = new Thread(new TimerRunnable());
        th.start();
    }
}