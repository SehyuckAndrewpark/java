package kr.mjc.sehyuckpark.java.threads;

public class Printer {
    public synchronized void println(String str) {
        for (char c : str.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        System.out.print('\n');
    }
}
