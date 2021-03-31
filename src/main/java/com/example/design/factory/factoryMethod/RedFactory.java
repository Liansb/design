package com.example.design.factory.factoryMethod;

/**
 * @program: design
 * @description: 创建red的工厂类
 * @author: shuaibin
 * @create: 2021-03-31 13:34
 **/
public class RedFactory implements ColorFactory{

    @Override
    public Color showColor() {
        return new Red();
    }
}
