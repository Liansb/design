package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: 创建black的工厂类
 * @author: shuaibin
 * @create: 2021-03-31 13:33
 **/
public class BlackFactory extends AbstractFactory{

    @Override
    public Color produceColor() {
        return new Black();
    }

    @Override
    public Ball produceBall() {
        return new BlackBall();
    }
}
