package com.example.design.bridge;

import lombok.Data;

/**
 * @program: design
 * @description: 抽象学生类
 * @author: shuaibin
 * @create: 2021-04-01 13:28
 **/
@Data
public abstract class Student {
    /**
     * 学生名称
     */
    private String name;
    /**
     * 学生等级接口
     */
    Rank rank;

    public Student(Rank rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    /**
     * 获得学生情况方法
     */
    public abstract void getStudent();
}
