package com.cpf.patterns.singleton;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：否
 * 它基于 classloader
 * 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化浪费内存
 */
public class SingletonObject1 {
    /**
     * 类加载时就创建对象饿汉模式
     */
    private static SingletonObject1 singletonObject;

    private SingletonObject1() {

    }

    public static SingletonObject1 getInstance() {
        if (null == singletonObject){
            singletonObject = new SingletonObject1();
        }
        return singletonObject;
    }

    public void showMessage(String message) {
        System.out.println("hello" + message);
    }
}
