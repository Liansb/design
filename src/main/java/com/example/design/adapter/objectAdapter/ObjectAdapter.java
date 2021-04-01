package com.example.design.adapter.objectAdapter;

/**
 * @program: design
 * @description: 包装类
 * @author: shuaibin
 * @create: 2021-04-01 10:05
 **/
public class ObjectAdapter implements ObjectTarget {

    private ObjectAdaptee objectAdaptee;

    public ObjectAdapter(ObjectAdaptee objectAdaptee){
        this.objectAdaptee = objectAdaptee;
    }

    @Override
    public void getSteamedBread(){
        System.out.println("我需要面粉做馒头");
        objectAdaptee.getFlour();
        System.out.println("我收到了面粉进行加工");
        System.out.println("我提供馒头");

    }
}
