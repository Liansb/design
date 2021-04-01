package com.example.design.proxy.cglibProxy;


/**
 * @program: design
 * @description: 目标类(需要被代理的类)
 * @author: shuaibin
 * @create: 2021-04-01 14:46
 **/
public class CglibTarget{
    /**
     * 方法1
     */
    public void method1() {
        System.out.println("method1");
    }

    /**
     * 方法2
     */
    public void method2() {
        System.out.println("method2");
    }

    /**
     * 方法3
     */
    public void method3() {
        System.out.println("method3");
    }
}
