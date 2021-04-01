package com.example.design.decorator;

/**
 * @program: design
 * @description: 装饰抽象类，例如用家具来装饰
 * @author: shuaibin
 * @create: 2021-04-01 14:13
 **/
public abstract class Furniture implements Room{

    public Room room;

    public void furniture(Room room){
        this.room = room;
    }
    /**
     * 展示方法
     */
    @Override
    public void show(){
        this.room.show();
    }
}
