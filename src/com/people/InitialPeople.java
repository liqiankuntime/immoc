package com.people;

/**
 * Created by Liqiankun on 2019/2/22
 * param:
 */
public class InitialPeople {

    public static void main(String[] args){
        People chinesePeople = new Chinese();
        People englishPeople = new English();

        chinesePeople.say();
        englishPeople.say();
    }

}
