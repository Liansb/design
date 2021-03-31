package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: 创建red的工厂类
 * @author: shuaibin
 * @create: 2021-03-31 13:34
 **/
public class RedFactory extends AbstractFactory{


    @Override
    public Color produceColor() {
        return new Red();
    }

    @Override
    public Ball produceBall() {
        return new RedBall();
    }
}
