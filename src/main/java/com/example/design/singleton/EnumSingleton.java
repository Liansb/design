package com.example.design.singleton;

/**
 * @program: design
 * @description: 双重检查创建实例对象
 * @author: shuaibin
 * @create: 2021-03-31 15:05
 **/
public enum EnumSingleton {
    //该写法可以防止反序列化创建新的对象
    BODY;

    public EnumSingleton getInstance(){
        return BODY;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //枚举创建实例比较
        EnumSingleton enumSingletonA = EnumSingleton.BODY.getInstance();
        EnumSingleton enumSingletonB = EnumSingleton.BODY.getInstance();
        System.out.println("枚举创建实例比较：" + (enumSingletonA == enumSingletonB));
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        System.out.println("普通对象创建的实例比较：" + (ordinaryObjectA == ordinaryObjectB));
    }
}
