package com.example.design.composite;

/**
 * @program: design
 * @description: 公司视图
 * @author: shuaibin
 * @create: 2021-04-02 11:30
 **/
public class CompanyClient {
    public static void main(String[] args) {
        //一步一步调用，完成公司架构创建
        CompanyComponent hangzhou = new CompanyComposite("新中大集团杭州总部");
        hangzhou.addChild(new ADDepartment("行政部门"));
        hangzhou.addChild(new TDDDepartment("技术部门"));

        CompanyComponent guangzhou = new CompanyComposite("新中大集团广州分公司");
        guangzhou.addChild(new ADDepartment("行政部门"));
        guangzhou.addChild(new TDDDepartment("技术部门"));

        CompanyComponent ningbo = new CompanyComposite("新中大集团宁波分公司");
        ningbo.addChild(new ADDepartment("行政部门"));
        ningbo.addChild(new TDDDepartment("技术部门"));

        hangzhou.addChild(guangzhou);
        hangzhou.addChild(ningbo);

        hangzhou.getChild(0);
    }
}
