package com.jp.multithreading.java.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executorService.execute(() -> {
                System.out.println("The current thread is :" + Thread.currentThread().getName() +
                        " executing task :"+taskNumber);
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }

            });
        }
        executorService.shutdown();
    }
}
