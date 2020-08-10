package com.cpf.patterns.strategy;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 * 策略模式：
 * 一般用于算法
 * 一般有一个context(Strategy strategy) 上下文中包含策略的接口，然后根据
 * 不同的实现类，调用context中的算法。方便扩展
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        System.out.println(context.exec(1, 2));

        context.setStrategy(new StrategySub());
        System.out.println(context.exec(1, 2));

        context.setStrategy(new StrategyMul());
        System.out.println(context.exec(1, 2));
    }
}
