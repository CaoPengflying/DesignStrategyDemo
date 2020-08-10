package com.cpf.patterns.singleton;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * 登记式/静态内部类
 */
public class SingletonObject4 {

    public static class SingletonBuilder {
        public static final SingletonObject4 INSTANCE = new SingletonObject4();
    }

    private SingletonObject4() {

    }

    public synchronized static SingletonObject4 getInstance() {
        return SingletonBuilder.INSTANCE;
    }

    public void showMessage(String message) {
        System.out.println("hello" + message);
    }
}
