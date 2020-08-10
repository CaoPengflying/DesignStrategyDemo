package com.cpf.patterns.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * date 2020/7/5
 *
 * @author caopengflying
 */
public class JavaProxy implements InvocationHandler {
    // 代理对象
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        // 取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前操作");
        Object invoke = method.invoke(target, args);
        System.out.println("代理后操作");
        return invoke;
    }
}
