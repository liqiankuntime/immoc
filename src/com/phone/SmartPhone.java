package com.phone;

import com.immoc.Telephone;

/**
 * Created by Liqiankun on 2019/2/22
 * param:
 */
public class SmartPhone extends Telephone implements IPlayGame {
    public void call(){
        System.out.println("通过语音打电话");
    }
    public void message(){
        System.out.println("通过语音发短信");
    }

    public void playGame(){
        System.out.println("具有啦游戏功能");
    }
}
