package com.immoc;

/**
 * Created by Liqiankun on 2018/11/21
 * param:
 */
public class Telephone {
    double screen;
    double memory;
    double cpu;

    public void setScreen(double screen) {
        this.screen = screen;
    }

    void sendMessage(){
        System.out.println("发短信功能"+screen + memory + cpu);
    };
    void teleFn(){
        System.out.println("打电话功能");
    }
}
