package com.example.design.decorator;

/**
 * @program: design
 * @description: 电视
 * @author: shuaibin
 * @create: 2021-04-01 14:20
 **/
public class Television extends FurnitureDecorator{
    /**
     * 用电视进行装饰
     */
    @Override
    public void show(){
        System.out.print("买了电视 ");
        super.show();
    }

}
