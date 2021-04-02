package com.example.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: design
 * @description: 自驾游
 * @author: shuaibin
 * @create: 2021-04-02 14:42
 **/
@Slf4j
public class DriveCar extends TourismTemplate{
    @Override
    public void chooseATravelMethod() {
        log.debug("选择自驾游");
        System.out.println("开车出发");
    }

    @Override
    public void play() {
        log.debug("选择开车游览景点");
        System.out.println("开车游玩");
    }

    @Override
    public boolean weather() {
        return false;
    }
}
