package com.example.design.factory.factoryMethod;

/**
 * @program: design
 * @description: 工厂工作类
 * @author: shuaibin
 * @create: 2021-03-31 13:10
 **/
public class WorkFactory {
    public static void main(String[] args) {
        //调用创建黑色的工厂进行工作
        ColorFactory blackColorFactory = new BlackFactory();
        blackColorFactory.showColor().getColorName();
        //调用创建红色的工厂进行工作
        ColorFactory redColorFactory = new RedFactory();
        redColorFactory.showColor().getColorName();
        //调用创建蓝色的工厂进行工作
        ColorFactory blueColorFactory = new BlueFactory();
        blueColorFactory.showColor().getColorName();
    }
}
