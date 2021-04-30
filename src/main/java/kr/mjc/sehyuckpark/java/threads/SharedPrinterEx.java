package kr.mjc.sehyuckpark.java.threads;

public class SharedPrinterEx {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread(() -> printer.println("ABCDE")).start();

        new Thread(() -> printer.println("abcde")).start();
    }
}