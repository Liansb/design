package com.example.design.factory.factoryMethod;



/**
 * @program: design
 * @description: 红色对应类
 * @author: shuaibin
 * @create: 2021-03-31 13:17
 **/
public class Red implements Color {

    @Override
    public void getColorName() {
        System.out.println("Red");
    }
}
