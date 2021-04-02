package com.example.design.singleton;

/**
 * @program: design
 * @description: 线程不安全懒汉对象
 * @author: shuaibin
 * @create: 2021-03-31 14:23
 **/
public class LazySingleton {
    /**
     * 内部创建线程不安全实例
     */
    public static LazySingleton threadNoSafeLazySingleton;
    /**
     * 内部创建同步方法线程安全实例
     */
    public static LazySingleton threadSafeByMethodLazySingleton;
    /**
     * 内部创建同步代码块线程安全实例
     */
    public static LazySingleton threadSafeByCodeBlockLazySingleton;

    private LazySingleton(){}

    /**
     * 线程不安全实例化
     * @return
     */
    public static LazySingleton getThreadNoSafeLazySingleton(){
        if (threadNoSafeLazySingleton == null){
            threadNoSafeLazySingleton = new LazySingleton();
        }
        return threadNoSafeLazySingleton;
    }

    /**
     * 同步方法线程安全对象实例化
     * @return
     */
    public static synchronized LazySingleton getThreadSafeByMethodLazySingleton(){
        if (threadSafeByMethodLazySingleton == null){
            threadSafeByMethodLazySingleton = new LazySingleton();
        }
        return threadSafeByMethodLazySingleton;
    }

    /**
     * 同步代码块线程安全对象实例化
     * @return
     */
    public static LazySingleton getThreadSafeByCodeBlockLazySingleton(){
        if (threadSafeByCodeBlockLazySingleton == null){
            synchronized (LazySingleton.class) {
                threadSafeByCodeBlockLazySingleton = new LazySingleton();
            }
        }
        return threadSafeByCodeBlockLazySingleton;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //单例模式创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //饿汉创建的线程不安全实例比较
        LazySingleton threadNoSafeLazySingletonA = LazySingleton.getThreadNoSafeLazySingleton();
        LazySingleton threadNoSafeLazySingletonB = LazySingleton.getThreadNoSafeLazySingleton();
        System.out.println("饿汉创建的线程不安全实例比较：" + (threadNoSafeLazySingletonA == threadNoSafeLazySingletonB));
        //饿汉创建的同步方法线程安全实例比较
        LazySingleton threadSafeByMethodLazySingletonA = LazySingleton.getThreadSafeByMethodLazySingleton();
        LazySingleton threadSafeByMethodLazySingletonB = LazySingleton.getThreadSafeByMethodLazySingleton();
        System.out.println("饿汉创建的同步方法线程安全实例比较：" + (threadSafeByMethodLazySingletonA == threadSafeByMethodLazySingletonB));
        //饿汉创建的同步代码块线程安全实例比较
        LazySingleton threadSafeByCodeBlockLazySingletonA = LazySingleton.getThreadSafeByCodeBlockLazySingleton();
        LazySingleton threadSafeByCodeBlockLazySingletonB = LazySingleton.getThreadSafeByCodeBlockLazySingleton();
        System.out.println("饿汉创建的同步代码块线程安全实例比较：" + (threadSafeByCodeBlockLazySingletonA == threadSafeByCodeBlockLazySingletonB));
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        System.out.println("普通对象创建的实例比较：" + (ordinaryObjectA == ordinaryObjectB));
    }
}
