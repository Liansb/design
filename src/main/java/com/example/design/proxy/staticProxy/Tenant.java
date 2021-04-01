package com.example.design.proxy.staticProxy;

/**
 * @program: design
 * @description: 租客类
 * @author: shuaibin
 * @create: 2021-04-01 14:34
 **/
public class Tenant {
    public static void main(String[] args) {
        //租客通过中介租房子，中介通过代理收取了额外的费用
        Medium medium = new Medium();
        System.out.println("我是租客，租房花费" + medium.letOut() + "元");
    }
}
