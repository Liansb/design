package com.example.design.factory.factoryMethod;

/**
 * @program: design
 * @description: 创建black的工厂类
 * @author: shuaibin
 * @create: 2021-03-31 13:33
 **/
public class BlackFactory implements ColorFactory{

    @Override
    public Color showColor(){
        return new Black();
    }
}
