package kr.mjc.sehyuckpark.java.threads.homework;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class GetContent {

    final String[] SITES = {"google.com", "youtube.com", "facebook.com",
            "instagram.com", "netflix.com", "twitter.com", "wikipedia.org",
            "imdb.com"};

    public void go() {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < SITES.length; i++) {
            try {
                FileUtils.copyURLToFile(new URL("https://" + SITES[i]),
                        new File("out/" + SITES[i]));
                System.out.format("%s : %d ms\n", SITES[i],
                        System.currentTimeMillis() - start);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void come() {
        ExecutorService service = Executors.newFixedThreadPool(SITES.length);
        final long start = System.currentTimeMillis();
        for (int i = 0; i < SITES.length; i++) {
            final int N = i;
            service.execute(() -> {
                try {
                    FileUtils.copyURLToFile(new URL("https://" + SITES[N]),
                            new File("out/" + SITES[N]));
                    System.out.format("%s : %d ms\n", SITES[N],
                            System.currentTimeMillis() - start);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }

    public static void main(String[] args) {
        new GetContent().come();
    }
}