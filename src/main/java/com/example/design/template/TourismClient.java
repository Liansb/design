package com.example.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: design
 * @description: 旅游实现类
 * @author: shuaibin
 * @create: 2021-04-02 14:46
 **/
@Slf4j
public class TourismClient {
    public static void main(String[] args) {
        log.debug("自驾游");
        TourismTemplate driveCar = new DriveCar();
        driveCar.tourism();
        log.debug("乘坐飞机");
        TourismTemplate takePlane = new TakePlane();
        takePlane.tourism();
    }
}
