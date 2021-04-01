package com.example.design.proxy.dynamicProxy;

import com.example.design.proxy.cglibProxy.CglibTarget;

/**
 * @program: design
 * @description: 动态代理效果实现类
 * @author: shuaibin
 * @create: 2021-04-01 14:49
 **/
public class DynamicProxyClient {
    public static void main(String[] args) {
        //需要代理的对象
        DynamicTarget dynamicTarget = new DynamicTarget();
        //通过代理工厂对对象进行动态代理
        DynamicTargetInterface dynamicProxy = (DynamicTargetInterface) DynamicProxyFactory.getProxy(dynamicTarget);
        //代理结果
        dynamicProxy.method1();
        dynamicProxy.method2();
        dynamicProxy.method3();;
    }
}
