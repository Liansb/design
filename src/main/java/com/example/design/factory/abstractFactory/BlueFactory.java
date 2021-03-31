package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: 创建blue的工厂类
 * @author: shuaibin
 * @create: 2021-03-31 13:34
 **/
public class BlueFactory extends AbstractFactory {


    @Override
    public Color produceColor() {
        return new Blue();
    }

    @Override
    public Ball produceBall() {
        return new BlueBall();
    }
}
