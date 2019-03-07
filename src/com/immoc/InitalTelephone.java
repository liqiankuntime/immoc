package com.immoc;

/**
 * Created by Liqiankun on 2018/11/21
 * param:
 */
public class InitalTelephone {
    public static void main(String[] args){
        Telephone phone = new Telephone();

        phone.screen = 5.8;
        phone.memory = 2.0;
        phone.cpu = 2.6;

        phone.setScreen(8.8);
        phone.sendMessage();

        phone.teleFn();
    }
}
