package com.cpf.patterns.singleton;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 * 更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 */
public enum SingletonEnum {
    /**
     * 单例
     */
    INSTANCE;

    public void showMessage(String message) {
        System.out.println("hello " + message);
    }
}
