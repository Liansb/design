package com.example.design.bridge;

/**
 * @program: design
 * @description: 学生客户端
 * @author: shuaibin
 * @create: 2021-04-01 13:42
 **/
public class StudentClient {
    public static void main(String[] args) {
        //A类男学生
        RankA rankA = new RankA();
        MaleStudent maleStudent = new MaleStudent(rankA,"小明");
        maleStudent.getStudent();
        //B类女学生
        RankB rankB = new RankB();
        FemaleStudent femaleStudent = new FemaleStudent(rankB,"小红");
        femaleStudent.getStudent();
    }
}
