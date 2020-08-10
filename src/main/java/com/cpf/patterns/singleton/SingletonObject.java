package com.cpf.patterns.singleton;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 * 是否 Lazy 初始化：否
 *
 * 是否多线程安全：是
 * 它基于 classloader
 * 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化浪费内存
 */
public class SingletonObject {
    /**
     * 类加载时就创建对象饿汉模式
     */
    private static final SingletonObject singletonObject = new SingletonObject();

    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public void showMessage(String message) {
        System.out.println("hello" + message);
    }
}
