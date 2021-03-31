package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: 工厂工作类
 * @author: shuaibin
 * @create: 2021-03-31 13:10
 **/
public class WorkAbstractFactory {
    public static void main(String[] args) {
        //调用创建黑色的工厂进行工作
        BlackFactory blackColorFactory = new BlackFactory();
        blackColorFactory.produceColor().getColorName();
        blackColorFactory.produceBall().getColorBallName();
        //调用创建红色的工厂进行工作
        RedFactory redColorFactory = new RedFactory();
        redColorFactory.produceColor().getColorName();
        redColorFactory.produceBall().getColorBallName();
        //调用创建蓝色的工厂进行工作
        BlueFactory blueColorFactory = new BlueFactory();
        blueColorFactory.produceColor().getColorName();
        blueColorFactory.produceBall().getColorBallName();
    }
}
