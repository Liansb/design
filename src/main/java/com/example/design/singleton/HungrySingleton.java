package com.example.design.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: design
 * @description: 饿汉对象
 * @author: shuaibin
 * @create: 2021-03-31 10:25
 **/
@Slf4j
public class HungrySingleton {
    /**
     * 确保只有一个实例
     * static,final修饰表示这个实例化对象是静态并且不能被修改
     */
    private static final HungrySingleton CONSTANT_HungrySingleton = new HungrySingleton();

    private static HungrySingleton codeBlockHungrySingleton;
    static {
        codeBlockHungrySingleton = new HungrySingleton();
    }

    /**
     * 构造方法私有
     */
    private HungrySingleton(){}

    /**
     * 给外界提供实例化对象
     * 该方法也要用静态的,给外界调用要用public
     */
    public static HungrySingleton getConstantInstance(){
        return CONSTANT_HungrySingleton;
    }

    public static HungrySingleton getCodeBlockInstance(){
        return codeBlockHungrySingleton;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //单例模式创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //静态常量创建比较
        HungrySingleton constantHungrySingletonA = HungrySingleton.getConstantInstance();
        HungrySingleton constantHungrySingletonB = HungrySingleton.getConstantInstance();
        log.debug("静态常量饿汉创建的实例比较:{}",constantHungrySingletonA == constantHungrySingletonB);
        //静态代码块创建比较
        HungrySingleton codeBlockHungrySingletonA = HungrySingleton.getCodeBlockInstance();
        HungrySingleton codeBlockHungrySingletonB = HungrySingleton.getCodeBlockInstance();
        log.debug("静态代码块饿汉创建的实例比较:{}",codeBlockHungrySingletonA == codeBlockHungrySingletonB);
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        log.debug("普通对象创建的实例比较:{}",ordinaryObjectA == ordinaryObjectB);
    }

}
