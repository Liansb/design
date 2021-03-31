package com.example.design.factory.factoryMethod;

/**
 * @program: design
 * @description: 创建blue的工厂类
 * @author: shuaibin
 * @create: 2021-03-31 13:34
 **/
public class BlueFactory implements ColorFactory{

    @Override
    public Color showColor() {
        return new Blue();
    }
}
