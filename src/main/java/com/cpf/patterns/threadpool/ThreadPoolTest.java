package com.cpf.patterns.threadpool;

import java.util.Random;
import java.util.concurrent.*;

/**
 * date 2020/7/17
 *
 * @author caopengflying
 */
public class ThreadPoolTest {


    public static void main(String[] args) {
        /**
         *
         * 阿尔萨斯
         * es倒排索引
         * 线程池的核心参数
         * mysql索引创建
         * hashmap源码解读
         *
         *  corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue
             corePoolSize 线程数量 最开始的数量
             maximumPoolSize最大线程数量 当任务数超过线程数量时
             keepAliveTime 存活时间
             unit 时间单位
             workQueue 任务队列
         */
/*        2、如何来设置
                * 需要根据几个值来决定
                - tasks ：每秒的任务数，假设为500~1000
                - taskcost：每个任务花费时间，假设为0.1s
                - responsetime：系统允许容忍的最大响应时间，假设为1s
                * 做几个计算
                - corePoolSize = 每秒需要多少个线程处理？
                * threadcount = tasks/(1/taskcost) =tasks*taskcout =  (500~1000)*0.1 = 50~100 个线程。corePoolSize设置应该大于50
                * 根据8020原则，如果80%的每秒任务数小于800，那么corePoolSize设置为80即可
                - queueCapacity = (coreSizePool/taskcost)*responsetime
                * 计算可得 queueCapacity = 80/0.1*1 = 800。意思是队列里的线程可以等待1s，超过了的需要新开线程来执行
                * 切记不能设置为Integer.MAX_VALUE，这样队列会很大，线程数只会保持在corePoolSize大小，当任务陡增时，不能新开线程来执行，响应时间会随之陡增。
        - maxPoolSize = (max(tasks)- queueCapacity)/(1/taskcost)
                * 计算可得 maxPoolSize = (1000-80)/10 = 92
                * （最大任务数-队列容量）/每个线程每秒处理能力 = 最大线程数
                - rejectedExecutionHandler：根据具体情况来决定，任务不重要可丢弃，任务重要则要利用一些缓冲机制来处理
                - keepAliveTime和allowCoreThreadTimeout采用默认通常能满足*/

         ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10, 1000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread();
                thread.setName("cpf");
                return thread;
            }
        });
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    Integer integer = test01();
                    System.out.println(Thread.currentThread().getName());
                }
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static Integer test01() {
        System.out.println("我被调用了");
        return new Random().nextInt(100);
    }
}
