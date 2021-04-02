package com.example.design.composite;

import lombok.Data;

/**
 * @program: design
 * @description: 行政部
 * @author: shuaibin
 * @create: 2021-04-02 11:22
 **/
@Data
public class ADDepartment extends CompanyComponent{
    /**
     * 部门名称
     */
    private String departmentName;

    public ADDepartment(String departmentName){
        this.departmentName = departmentName;
    }

    @Override
    public void addChild(CompanyComponent companyComponent) {

    }

    @Override
    public void removeChild(CompanyComponent companyComponent) {

    }

    @Override
    public void getChild(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("+");
        }
        System.out.println(new String(sb) + this.getDepartmentName());
    }
}
