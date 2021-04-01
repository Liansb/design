package com.example.design.decorator;

/**
 * @program: design
 * @description: 具体装饰类，比如沙发
 * @author: shuaibin
 * @create: 2021-04-01 14:17
 **/
public class Sofa extends Furniture{
    /**
     * 用沙发进行装饰
     */
    @Override
    public void show(){
        System.out.print("买了沙发 ");
        super.show();
    }

}
