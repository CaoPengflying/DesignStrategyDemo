package com.cpf.patterns.unionResult;

import java.util.concurrent.*;

/**
 * date 2020/7/19
 *
 * @author caopengflying
 */
public class UnionResultTest {
    static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
                getAllInfo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void getAllInfo() {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(UnionResultTest::get01, threadPoolExecutor);
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(UnionResultTest::get02, threadPoolExecutor);
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(UnionResultTest::get03, threadPoolExecutor);
        //等待三个数据源都返回后，再组装数据。这里会有一个线程阻塞
        CompletableFuture.allOf(f1, f2, f3).join();
        try {
            String baseInfo = f1.get();
            String detailInfo = f2.get();
            String skuInfo = f3.get();
            System.out.println(Thread.currentThread().getName() + baseInfo);
            System.out.println(Thread.currentThread().getName() + detailInfo);
            System.out.println(Thread.currentThread().getName() + skuInfo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static String get01() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "数据1";
    }

    public static String get02() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "数据2";
    }

    public static String get03() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "数据3";
    }
}
