package com.cpf.patterns.template;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class Basketball extends Game {

    @Override
    void init() {
        System.out.println("篮球 初始化");
    }

    @Override
    void start() {
        System.out.println("篮球 开始");
    }

    @Override
    void end() {
        System.out.println("篮球 结束");
    }
}
