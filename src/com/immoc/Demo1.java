package com.immoc;
import java.util.Scanner;

/**
 * Created by Liqiankun on 2018/11/16
 * 5-3： 编程练习优化
 * param:
 */
public class Demo1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//System.in代表输入设备
        System.out.print("请输入考试信息：");
        int score = input.nextInt();//获取输入的值
        int count = 0;

        System.out.println("加分前的成绩:" + score);

        while(score < 60){
            score++;
            count++;
        }
        System.out.println("加分后的成绩:" + score);
        System.out.println("共加了" + count + '次');
    }
}
