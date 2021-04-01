package com.example.design.proxy.dynamicProxy;

/**
 * @program: design
 * @description: 目标类(需要被代理的类)
 * @author: shuaibin
 * @create: 2021-04-01 14:46
 **/
public class DynamicTarget implements DynamicTargetInterface {
    /**
     * 方法1
     */
    @Override
    public void method1() {
        System.out.println("method1");
    }

    /**
     * 方法2
     */
    @Override
    public void method2() {
        System.out.println("method2");
    }

    /**
     * 方法3
     */
    @Override
    public void method3() {
        System.out.println("method3");
    }
}
