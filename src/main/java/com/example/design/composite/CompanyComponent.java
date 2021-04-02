package com.example.design.composite;

import lombok.Data;

/**
 * @program: design
 * @description: 组合模式抽象类
 * @author: shuaibin
 * @create: 2021-04-02 10:44
 **/
@Data
public abstract class CompanyComponent {
    /**
     * 名称
     */
    private String name;

    public CompanyComponent(){}

    public CompanyComponent(String name){
        this.name = name;
    }

    /**
     * 增加子节点
     * 该抽象类并不能调用此方法，需要交给下属去做
     */
    public void addChild(CompanyComponent companyComponent){
        throw new UnsupportedOperationException("该对象不支持此功能");
    }

    /**
     * 删除子节点
     * 该抽象类并不能调用此方法，需要交给下属去做
     */
    public void removeChild(CompanyComponent companyComponent){
        throw new UnsupportedOperationException("该对象不支持此功能");
    }

    /**
     * 获取输出其下面节点
     * 该抽象类并不能调用此方法，需要交给下属去做
     * @param depth
     */
    public void getChild(int depth){
        throw new UnsupportedOperationException("该对象不支持此功能");
    };

}
