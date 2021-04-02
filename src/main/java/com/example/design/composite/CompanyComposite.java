package com.example.design.composite;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design
 * @description: 组合对象
 * @author: shuaibin
 * @create: 2021-04-02 10:56
 **/
@Data
@Slf4j
public class CompanyComposite extends CompanyComponent{
    /**
     * 组件名字
     */
    private List<CompanyComponent> companyComponentList;

    public CompanyComposite(String name) {
        super(name);
        companyComponentList = new ArrayList<>();
    }

    @Override
    public void addChild(CompanyComponent company) {
        companyComponentList.add(company);
    }

    @Override
    public void removeChild(CompanyComponent company) {
        companyComponentList.remove(company);
    }

    @Override
    public void getChild(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("+");
        }
        System.out.println(stringBuilder.toString() + this.getName());
        for (CompanyComponent c : companyComponentList) {
            c.getChild(depth + 2);
        }
    }

}
