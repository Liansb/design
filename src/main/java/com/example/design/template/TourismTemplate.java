package com.example.design.template;

/**
 * @program: design
 * @description: 旅游过程(模板类 ， 固定好整个流程)
 * @author: shuaibin
 * @create: 2021-04-02 14:22
 **/
public abstract class TourismTemplate {
    /**
     * 模板流程：
     * 模板模式就是先把整个流程给固定，中间你可以改变东西，但流程不能变
     * 就比如出去旅游，过程如下：
     * 1、选定要去的地方（地方可以不同）
     * 2、前往目的地（出行方式可以不同）
     * 3、到达目的地（中途可以停留或变道）
     * 4、在目的地游玩（在景点有不同的游玩方式）
     * 备注：有一种钩子方法，就是通过判断运行不同的方法
     * 比如旅游目的地有台风，就不会进行游玩了
     */
    public final void tourism(){
        findDestination();
        chooseATravelMethod();
        arriveDestination();
        if (weather()) {
            play();
            System.out.println("完成出行");
        } else {
            System.out.println("天气不好，没有游玩");
        }
    }

    /**
     * 查找目的地
     * 这里固定目的地
     */
    private void findDestination(){
        System.out.println("查找目的地去旅游");
    }

    /**
     * 选择出行方式
     * 这理由调用者自行选择
     */
    public abstract void chooseATravelMethod();

    /**
     * 到达目的地
     * 固定直接到达
     */
    private void arriveDestination(){
        System.out.println("直接到达目的地");
    }

    /**
     * 在目的地游玩
     * 游玩方式不固定
     */
    public abstract void play();

    /**
     * 天气情况
     * 好的话游玩，否则不游玩
     * @return
     */
    public abstract boolean weather();

}
