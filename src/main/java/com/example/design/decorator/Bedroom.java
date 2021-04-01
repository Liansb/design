package com.example.design.decorator;

/**
 * @program: design
 * @description: 要装饰的对象，比如装饰卧室
 * @author: shuaibin
 * @create: 2021-04-01 14:11
 **/
public class Bedroom implements Room{

    @Override
    public void show() {
        System.out.println("装饰好的卧室");
    }

}
