package com.cpf.patterns.template;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 * 模板模式
 * 定义好算法中的执行顺序，然后具体内容由其子类取实现
 * 这样就可以在不改变算法结构的情况下执行。
 */
public class TemplateTest {
    public static void main(String[] args) {
        Game game = new Basketball();
        game.play();
        game = new FootBall();
        game.play();
    }
}
