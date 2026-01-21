package com.jp.multithreading.java.thread.executors;

import java.util.concurrent.*;

public class CallableExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Main Thread is Starting...");

        System.out.println("Submit the Task!");

        Future<String> future = (Future<String>) executorService.submit(()->{
            try
            {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            return "Hello World";
        });
        executorService.shutdown();
        System.out.println("Main Thread is working on...");

        try {
            System.out.println("Result of submitted task: "+future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
