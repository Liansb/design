package com.example.design.proxy.cglibProxy;


/**
 * @program: design
 * @description: cglib代理效果实现类
 * @author: shuaibin
 * @create: 2021-04-01 14:49
 **/
public class CglibProxyClient {
    public static void main(String[] args) {
        //需要代理的对象
        CglibTarget cglibTarget = new CglibTarget();
        //通过代理工厂对对象进行动态代理
        CglibTarget cglibProxy = (CglibTarget) CglibProxyFactory.getCglibProxy(cglibTarget);
        //代理结果
        cglibProxy.method1();
        cglibProxy.method2();
        cglibProxy.method3();;
    }
}
