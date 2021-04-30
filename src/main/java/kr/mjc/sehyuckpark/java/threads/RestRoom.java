package kr.mjc.sehyuckpark.java.threads;

public class RestRoom {
    public void use() {
        synchronized (this) {
            System.out.format("%s : Get in the Bathroom.\n", Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.format("%s : Out from Bathroom.\n", Thread.currentThread().getName());
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.format("%s : Wash Hands.\n", Thread.currentThread().getName());
    }
}
