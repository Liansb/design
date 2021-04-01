package com.example.design.bridge;

/**
 * @program: design
 * @description: A等级
 * @author: shuaibin
 * @create: 2021-04-01 13:33
 **/
public class RankA implements Rank{
    @Override
    public void getRank() {
        System.out.print("A等级 ");
    }
}
