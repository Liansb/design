package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: 黑色对应类
 * @author: shuaibin
 * @create: 2021-03-31 13:16
 **/
public class Black implements Color {

    @Override
    public void getColorName(){
        System.out.println("Black");
    }
}
