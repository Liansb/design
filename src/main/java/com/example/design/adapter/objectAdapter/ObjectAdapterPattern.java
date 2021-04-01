package com.example.design.adapter.objectAdapter;

/**
 * @program: design
 * @description: 适配器实现类
 * @author: shuaibin
 * @create: 2021-04-01 10:13
 **/
public class ObjectAdapterPattern {

    public static void main(String[] args) {
        ObjectAdapter objectAdapter = new ObjectAdapter(new ObjectAdaptee());
        objectAdapter.getSteamedBread();
    }

}
