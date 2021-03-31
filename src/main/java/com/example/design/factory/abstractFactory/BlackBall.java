package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: black球对象
 * @author: shuaibin
 * @create: 2021-03-31 13:53
 **/
public class BlackBall implements Ball{

    @Override
    public void getColorBallName(){
        System.out.println("BlackBall");
    }
}
