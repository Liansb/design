package com.example.design.factory.simpleFactory;

/**
 * @program: design
 * @description: 蓝色对应类
 * @author: shuaibin
 * @create: 2021-03-31 13:21
 **/
public class Blue implements Color{

    @Override
    public void getColorName() {
        System.out.println("Blue");
    }
}
