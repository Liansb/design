package com.example.design.decorator;

/**
 * @program: design
 * @description: 装饰好的卧室
 * @author: shuaibin
 * @create: 2021-04-01 14:21
 **/
public class BedroomClient {
    public static void main(String[] args) {
        Room room = new Bedroom();
        Sofa sofa = new Sofa();
        Television television = new Television();
        //用沙发装饰房间
        sofa.FurnitureDecorator(room);
        //再加入电视
        television.FurnitureDecorator(sofa);
        television.show();
    }
}
