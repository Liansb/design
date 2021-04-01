package com.example.design.bridge;

/**
 * @program: design
 * @description: B等级
 * @author: shuaibin
 * @create: 2021-04-01 13:34
 **/
public class RankB implements Rank{
    @Override
    public void getRank() {
        System.out.print("C等级 ");
    }
}
