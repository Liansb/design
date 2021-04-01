package com.example.design.adapter.classAdapter;

/**
 * @program: design
 * @description: 包装类
 * @author: shuaibin
 * @create: 2021-04-01 10:05
 **/
public class Adapter extends Adaptee implements Target{

    @Override
    public void getSteamedBread(){
        System.out.println("我需要面粉做馒头");
        this.getFlour();
        System.out.println("我收到了面粉进行加工");
        System.out.println("我提供馒头");

    }
}
