package com.cpf.patterns.template;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class FootBall extends Game {
    @Override
    void init() {
        System.out.println("足球 游戏初始化");
    }

    @Override
    void start() {
        System.out.println("足球游戏开始");
    }

    @Override
    void end() {
        System.out.println("足球游戏结束");
    }
}
