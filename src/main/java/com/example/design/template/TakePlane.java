package com.example.design.template;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @program: design
 * @description: 坐飞机出行,步行游玩
 * @author: shuaibin
 * @create: 2021-04-02 14:41
 **/
@Slf4j
public class TakePlane extends TourismTemplate{
    @Override
    public void chooseATravelMethod() {
        log.debug("选择坐飞机出行");
        System.out.println("乘坐飞机");
    }

    @Override
    public void play() {
        log.debug("步行游览目的地");
        System.out.println("游览");
    }

    @Override
    public boolean weather() {
        boolean result = getWeather();
        log.debug("获取到天气为 {}",result?"好天气":"坏天气");
        return result;
    }

    public boolean getWeather(){
        System.out.println("天气状况,好天气输入 1，坏天气输入 2");
        while (true) {
            System.out.println("请输入1或者2:");
            Scanner scanner = new Scanner(System.in);
            String weatherCondition = scanner.nextLine();
            if ("1".equals(weatherCondition)) {
                return true;
            } else if ("2".equals(weatherCondition)) {
                return false;
            } else {
                System.out.println("输入无效，请重新输入");
            }
        }
    }
}
