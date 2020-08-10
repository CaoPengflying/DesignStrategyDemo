package com.cpf.patterns.singleton;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class SingletonObject3 {
    /**
     * 类加载时就创建对象饿汉模式
     */
    private volatile static SingletonObject3 singletonObject;

    private SingletonObject3() {

    }

    public synchronized static SingletonObject3 getInstance() {
        if (null == singletonObject){
            synchronized (SingletonObject3.class){
                singletonObject = new SingletonObject3();
            }
        }
        return singletonObject;
    }

    public void showMessage(String message) {
        System.out.println("hello" + message);
    }
}
