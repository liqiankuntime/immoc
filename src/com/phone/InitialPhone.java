package com.phone;

import com.dog.Initial;
import com.immoc.Telephone;

/**
 * Created by Liqiankun on 2019/2/22
 * param:
 */
public class InitialPhone {
    public static void main(String[] args){
        Cellphone phone = new Cellphone();

        phone.call();
        phone.message();

        SmartPhone smartphone = new SmartPhone();
        smartphone.call();
        smartphone.message();

        IPlayGame PhonePlay = new SmartPhone();
        IPlayGame PspPlay = new Psp();
        PhonePlay.playGame();
        PspPlay.playGame();
    }
}
