package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: blue球对象
 * @author: shuaibin
 * @create: 2021-03-31 13:56
 **/
public class BlueBall implements Ball{

    @Override
    public void getColorBallName() {
        System.out.println("BlueBall");
    }
}
