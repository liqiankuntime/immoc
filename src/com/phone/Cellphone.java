package com.phone;

import com.immoc.Telephone;

/**
 * Created by Liqiankun on 2019/2/22
 * param:
 */
public class Cellphone extends Telephone {

    public void call(){
        System.out.println("通过键盘打电话");
    }

    public void message(){
        System.out.println("通过键盘发短信");
    }
}
