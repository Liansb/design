package com.example.design.appearance;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: design
 * @description: 小爱同学(外观角色Facade)
 * @author: shuaibin
 * @create: 2021-04-02 13:17
 **/
@Slf4j
public class XiaoaiClassmateAppearance {
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

    public XiaoaiClassmateAppearance(){
        light = new Light();
        geyser = new Geyser();
        television = new Television();
        washer = new Washer();
    }

    /**
     * 假如要进行一个复杂的操作
     * 客户端要完成操作需要很多步骤，如果客户端直接调用，需要调用多个对象的多个方法，比较复杂
     * 使用外观模式，客户端是与该对象进行交互，接下来的操作由该对象去完成，然后给客户端提供一个接口就行
     * 这样完成同样的效果，一个要交互多次，一个交互一次就行
     * 感觉方式跟代理模式比较像，不过代理模式是创建了一个对象的替身
     * 然后由替身去跟外界交互，有改动本体也不会受影响
     * 外观模式是一个对象操作多个对象，然后保存那些对象的方法操作
     * 外界跟外观对象交互就行了，然后由外观对象去与对应的对象去交互，还是调用本身
     */
    public void openAllDevice(){
        log.debug("小爱同学正在打开所有电器");
        light.openLight();
        geyser.openGeyser();
        television.openTelevision();
        washer.openWasher();
    }
}
