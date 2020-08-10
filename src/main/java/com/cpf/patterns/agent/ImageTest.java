package com.cpf.patterns.agent;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * date 2020/7/4
 *
 * @author caopengflying
 * 代理模式
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * 在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。
 * 在面向对象系统中，有些对象由于某些原因
 * （比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问）、
 * ，直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * Java提供了代理对象，通过反射进行接口代理
 * 如果没有生成接口也想使用代理，可以是使用cglib代理
 * 两者对比：java反射，性能稍差，但是是jdk本身的支持，不需要依赖，比较稳定
 * cglib 使用字节码，性能高，不需要实现接口。
 */
public class ImageTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("cpf.jpg");
        //从磁盘读取
        image.dispaly();
        //不需要从磁盘读取
        image.dispaly();
        RealImage realImage = new RealImage();
        // jdk 基于接口动态代理
        JavaProxy javaProxy = new JavaProxy();
        Image javaProxyInstance = (Image)javaProxy.getInstance(new RealImage("java proxy"));
        javaProxyInstance.dispaly();


    }
}
