package com.example.design.bridge;

/**
 * @program: design
 * @description: 男学生类
 * @author: shuaibin
 * @create: 2021-04-01 13:37
 **/
public class MaleStudent extends Student{
    public MaleStudent(Rank rank,String name){
        super(rank,name);
    }

    @Override
    public void getStudent() {
        rank.getRank();
        System.out.println("男学生 " + this.getName());
    }
}
