package com.example.design.proxy.staticProxy;

/**
 * @program: design
 * @description: 中介类（代理类）
 * @author: shuaibin
 * @create: 2021-04-01 14:34
 **/
public class Medium implements LetOutService{

    @Override
    public Integer letOut() {
        Landlady landlady = new Landlady();
        Integer rent = landlady.letOut() + 100;
        System.out.println("我是中介，加了100中介费");
        return rent;
    }
}
