package com.example.design.singleton;

/**
 * @program: design
 * @description: 线程不安全懒汉对象
 * @author: shuaibin
 * @create: 2021-03-31 14:23
 **/
public class Lazy {
    /**
     * 内部创建线程不安全实例
     */
    public static Lazy threadNoSafeLazy;
    /**
     * 内部创建同步方法线程安全实例
     */
    public static Lazy threadSafeByMethodLazy;
    /**
     * 内部创建同步代码块线程安全实例
     */
    public static Lazy threadSafeByCodeBlockLazy;

    private Lazy(){}

    /**
     * 线程不安全实例化
     * @return
     */
    public static Lazy getThreadNoSafeLazy(){
        if (threadNoSafeLazy == null){
            threadNoSafeLazy = new Lazy();
        }
        return threadNoSafeLazy;
    }

    /**
     * 同步方法线程安全对象实例化
     * @return
     */
    public static synchronized Lazy getThreadSafeByMethodLazy(){
        if (threadSafeByMethodLazy == null){
            threadSafeByMethodLazy = new Lazy();
        }
        return threadSafeByMethodLazy;
    }

    /**
     * 同步代码块线程安全对象实例化
     * @return
     */
    public static Lazy getThreadSafeByCodeBlockLazy(){
        if (threadSafeByCodeBlockLazy == null){
            synchronized (Lazy.class) {
                threadSafeByCodeBlockLazy = new Lazy();
            }
        }
        return threadSafeByCodeBlockLazy;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //单例模式创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //饿汉创建的线程不安全实例比较
        Lazy threadNoSafeLazyA = Lazy.getThreadNoSafeLazy();
        Lazy threadNoSafeLazyB = Lazy.getThreadNoSafeLazy();
        System.out.println("饿汉创建的线程不安全实例比较：" + (threadNoSafeLazyA == threadNoSafeLazyB));
        //饿汉创建的同步方法线程安全实例比较
        Lazy threadSafeByMethodLazyA = Lazy.getThreadSafeByMethodLazy();
        Lazy threadSafeByMethodLazyB = Lazy.getThreadSafeByMethodLazy();
        System.out.println("饿汉创建的同步方法线程安全实例比较：" + (threadSafeByMethodLazyA == threadSafeByMethodLazyB));
        //饿汉创建的同步代码块线程安全实例比较
        Lazy threadSafeByCodeBlockLazyA = Lazy.getThreadSafeByCodeBlockLazy();
        Lazy threadSafeByCodeBlockLazyB = Lazy.getThreadSafeByCodeBlockLazy();
        System.out.println("饿汉创建的同步代码块线程安全实例比较：" + (threadSafeByCodeBlockLazyA == threadSafeByCodeBlockLazyB));
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        System.out.println("普通对象创建的实例比较：" + (ordinaryObjectA == ordinaryObjectB));
    }
}
