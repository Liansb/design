package com.example.design.singleton;

/**
 * @program: design
 * @description: 静态内部类创建对象
 * @author: shuaibin
 * @create: 2021-03-31 14:58
 **/
public class StaticInnerClass {
    private StaticInnerClass(){}

    private static class StaticInnerClassInstance {
        private static final StaticInnerClass STATIC_INNER_CLASS = new StaticInnerClass();
    }

    public static StaticInnerClass getStaticInnerClass(){
        return StaticInnerClassInstance.STATIC_INNER_CLASS;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //单例模式创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //静态内部类创建比较
        StaticInnerClass staticInnerClassA = StaticInnerClass.getStaticInnerClass();
        StaticInnerClass staticInnerClassB = StaticInnerClass.getStaticInnerClass();
        System.out.println("静态常量饿汉创建的实例比较：" + (staticInnerClassA == staticInnerClassA));
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        System.out.println("普通对象创建的实例比较：" + (ordinaryObjectA == ordinaryObjectB));
    }
}
