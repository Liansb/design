package com.example.design.factory.simpleFactory;

/**
 * @program: design
 * @description: 简单工厂模式类
 * @author: shuaibin
 * @create: 2021-03-31 13:09
 **/
public class SimpleFactory {
    public Color color(String orderColor){
        Color color = null;
        if ("red".equals(orderColor)){
            color = new Red();
        } else if ("black".equals(orderColor)){
            color = new Black();
        } else if ("blue".equals(orderColor)){
            color = new Blue();
        }
        return color;
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.color("red").getColorName();
        simpleFactory.color("black").getColorName();
        simpleFactory.color("blue").getColorName();
    }
}
