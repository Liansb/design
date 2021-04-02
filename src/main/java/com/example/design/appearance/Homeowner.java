package com.example.design.appearance;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: design
 * @description: 房间主人(相当于客户端)
 * @author: shuaibin
 * @create: 2021-04-02 13:27
 **/
@Slf4j
public class Homeowner {
    /**
     * 灯
     */
    private Light light;
    /**
     * 热水器
     */
    private Geyser geyser;
    /**
     * 电视机
     */
    private Television television;
    /**
     * 洗衣机
     */
    private Washer washer;
    /**
     * 小爱同学
     */
    private XiaoaiClassmateAppearance xiaoaiClassmateAppearance;

    public Homeowner(){
        light = new Light();
        geyser = new Geyser();
        television = new Television();
        washer = new Washer();
        xiaoaiClassmateAppearance = new XiaoaiClassmateAppearance();
    }

    /**
     * 自己一个个打开
     */
    public void openDeviceBySelf(){
        light.openLight();
        geyser.openGeyser();
        television.openTelevision();
        washer.openWasher();
    }

    /**
     * 通过小爱同学打开
     */
    public void openDeviceByXiaoaiClassmate(){
        xiaoaiClassmateAppearance.openAllDevice();
    }

    public static void main(String[] args) {
        Homeowner homeowner = new Homeowner();
        log.debug("自己打开所有电器");
        homeowner.openDeviceBySelf();
        log.debug("自己太累了，让小爱同学打开所有电器");
        homeowner.openDeviceByXiaoaiClassmate();
    }
}
