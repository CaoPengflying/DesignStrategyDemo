package com.cpf.patterns.singleton;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 */
public class SingletonObjectTest {
    public static void main(String[] args) {
//        SingletonObject singletonObject = new SingletonObject();
        SingletonObject instance = SingletonObject.getInstance();
        instance.showMessage("饿汉模式");


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MINUTES,
                new LinkedBlockingQueue<Runnable>());
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.execute(new Runnable() {
                public void run() {
                    SingletonObject1 instance1 = SingletonObject1.getInstance();
                    instance1.showMessage("懒汉模式-线程不安全" + instance1.hashCode());
                    SingletonObject2 singletonObject2 = SingletonObject2.getInstance();
                    singletonObject2.showMessage("懒汉模式-线程安全" + singletonObject2.hashCode());
                }
            });
        }

        SingletonObject3 singletonObject3 = SingletonObject3.getInstance();

        singletonObject3.showMessage("双重锁机制");

        SingletonObject4 singletonObject4 = SingletonObject4.getInstance();
        singletonObject4.showMessage("静态内部类");


        SingletonEnum.INSTANCE.showMessage("枚举单例模式");
    }
}
