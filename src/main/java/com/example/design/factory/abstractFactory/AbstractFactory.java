package com.example.design.factory.abstractFactory;

/**
 * @program: design
 * @description: 能生产颜色和球的工厂对象
 * @author: shuaibin
 * @create: 2021-03-31 13:51
 **/
public abstract class AbstractFactory {
    /**
     * 生产颜色
     * @return
     */
    public abstract Color produceColor();

    /**
     * 生产球
     * @return
     */
    public abstract Ball produceBall();
}
