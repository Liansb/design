package com.example.design.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design
 * @description: cglib代理工厂
 * @author: shuaibin
 * @create: 2021-04-01 14:48
 **/
public class CglibProxyFactory {
    /**
     * cglib代理，找到需要代理的类，返回需要代理的对象
     * @param t
     * @param <T>
     * @return
     */
    static <T> Object getCglibProxy(T t){
        //帮我们生成代理对象
        Enhancer en = new Enhancer();
        //设置要代理的目标类
        en.setSuperclass(t.getClass());
        //代理要做什么
        en.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("执行方法前。。。");
                Object invoke = methodProxy.invokeSuper(object, args);
                System.out.println("执行方法后。。。");
                return invoke;
            }
        });
        //生成代理对象
        Object cglibProxyObj = en.create();
        return cglibProxyObj;
    }
}
