package com.example.design.proxy.staticProxy;

/**
 * @program: design
 * @description: 房东类
 * @author: shuaibin
 * @create: 2021-04-01 14:33
 **/
public class Landlady implements LetOutProxyService{
    /**
     * 房东出租房子，交给中介代理
     * @return
     */
    @Override
    public Integer letOut(){
        Integer rent = 100;
        System.out.println("我要出租房子，房租" + rent);
        return rent;
    }
}
