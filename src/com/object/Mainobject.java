package com.object;


/**
 * Created by Liqiankun on 2018/11/27
 * param:
 */
public class Mainobject {
    public String name;

    public void Telphone(){
        name = "iphone";
    }

    @Override
    public String toString() {
        return "Mainobject{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Mainobject object = new Mainobject();
        System.out.println(object);
    }
}
