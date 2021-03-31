package com.example.design.singleton;

/**
 * @program: design
 * @description: 饿汉对象
 * @author: shuaibin
 * @create: 2021-03-31 10:25
 **/
public class Hungry {
    /**
     * 确保只有一个实例
     * static,final修饰表示这个实例化对象是静态并且不能被修改
     */
    private static final Hungry CONSTANT_HUNGRY = new Hungry();

    private static Hungry codeBlockHungry;
    static {
        codeBlockHungry = new Hungry();
    }

    /**
     * 构造方法私有
     */
    private Hungry(){}

    /**
     * 给外界提供实例化对象
     * 该方法也要用静态的,给外界调用要用public
     */
    public static Hungry getConstantInstance(){
        return CONSTANT_HUNGRY;
    }

    public static Hungry getCodeBlockInstance(){
        return codeBlockHungry;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //单例模式创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //静态常量创建比较
        Hungry constantHungryA = Hungry.getConstantInstance();
        Hungry constantHungryB = Hungry.getConstantInstance();
        System.out.println("静态常量饿汉创建的实例比较：" + (constantHungryA == constantHungryB));
        //静态代码块创建比较
        Hungry codeBlockHungryA = Hungry.getCodeBlockInstance();
        Hungry codeBlockHungryB = Hungry.getCodeBlockInstance();
        System.out.println("静态代码块饿汉创建的实例比较：" + (constantHungryA == constantHungryB));
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        System.out.println("普通对象创建的实例比较：" + (ordinaryObjectA == ordinaryObjectB));
    }

}
