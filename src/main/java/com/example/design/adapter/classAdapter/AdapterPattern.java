package com.example.design.adapter.classAdapter;

/**
 * @program: design
 * @description: 适配器实现类
 * @author: shuaibin
 * @create: 2021-04-01 10:13
 **/
public class AdapterPattern {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.getSteamedBread();
    }
}
