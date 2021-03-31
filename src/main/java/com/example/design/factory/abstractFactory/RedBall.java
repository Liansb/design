package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: red球对象
 * @author: shuaibin
 * @create: 2021-03-31 13:55
 **/
public class RedBall implements Ball{

    @Override
    public void getColorBallName() {
        System.out.println("RedBall");
    }
}
