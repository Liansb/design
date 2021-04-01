package com.example.design.bridge;

/**
 * @program: design
 * @description: 女学生类
 * @author: shuaibin
 * @create: 2021-04-01 13:38
 **/
public class FemaleStudent extends Student{
    public FemaleStudent(Rank rank, String name) {
        super(rank, name);
    }

    @Override
    public void getStudent() {
        rank.getRank();
        System.out.println("女学生 " + this.getName());
    }
}
