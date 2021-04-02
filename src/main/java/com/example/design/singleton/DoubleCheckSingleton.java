package com.example.design.singleton;

/**
 * @program: design
 * @description: 双重检查创建实例对象
 * @author: shuaibin
 * @create: 2021-03-31 14:53
 **/
public class DoubleCheckSingleton {
    /**
     * volatile关键字修饰主要是为了同步时别的线程对其可见
     */
    private static volatile DoubleCheckSingleton DoubleCheckSingleton;

    private DoubleCheckSingleton(){}
    /**
     * 双重验证主要是为了在保证线程安全的情况下提升效率
     * 第一层判断主要是为了提升效率，如果实例存在，就直接调用，不存在时才会进入同步块
     * 然后再次进行判断，这个时候如果为空才会去创建新的实例
     * 不加第二层判断可能会导致创建多个实例
     * @return
     */
    public static DoubleCheckSingleton getDoubleCheckSingleton(){
        if (null == DoubleCheckSingleton){
            synchronized (DoubleCheckSingleton.class){
                if (null == DoubleCheckSingleton){
                    DoubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return DoubleCheckSingleton;
    }

    /**
     * 测试,定义两个对象，看得到的结果是否相同
     */
    public static void main(String[] args) {
        //创建两个对象进行比较,true代表为一个实例，false则不是一个实例
        //双重检查创建实例比较
        DoubleCheckSingleton DoubleCheckSingletonA = DoubleCheckSingleton.getDoubleCheckSingleton();
        DoubleCheckSingleton DoubleCheckSingletonB = DoubleCheckSingleton.getDoubleCheckSingleton();
        System.out.println("双重检查创建实例比较：" + (DoubleCheckSingletonA == DoubleCheckSingletonB));
        //创建两个普通对象进行比较,true代表为一个实例，false则不是一个实例
        OrdinaryObject ordinaryObjectA = new OrdinaryObject();
        OrdinaryObject ordinaryObjectB = new OrdinaryObject();
        System.out.println("普通对象创建的实例比较：" + (ordinaryObjectA == ordinaryObjectB));
    }
}
