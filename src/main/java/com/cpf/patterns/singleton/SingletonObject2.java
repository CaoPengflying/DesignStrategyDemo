package com.cpf.patterns.singleton;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class SingletonObject2 {
    /**
     * 类加载时就创建对象饿汉模式
     */
    private static SingletonObject2 singletonObject;

    private SingletonObject2() {

    }

    public synchronized static SingletonObject2 getInstance() {
        if (null == singletonObject){
            singletonObject = new SingletonObject2();
        }
        return singletonObject;
    }

    public void showMessage(String message) {
        System.out.println("hello" + message);
    }
}
