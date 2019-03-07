package com.immoc;
import java.util.Scanner;

/**
 * Created by Liqiankun on 2018/11/17
 * 5-5进阶练习
 * param:
 */
public class Demo2 {
    public static void main(String[] args){
        int classNum = 3;
        int studentNum = 4;
        int sum = 0;
        int avg = 0;
        Scanner input = new Scanner(System.in);//System.in 系统的输入设备
        for(int i = 1; i<= classNum; i++){//外层循环用于循环班级
            System.out.println("######请输入第" + i + "个班级的学生成绩:######");
            for(int j = 1; j <= studentNum; j++){//内层循环用于循环对应班级里的学生
                System.out.println("请输入第" + j + "个学生的成绩");
                int score = input.nextInt();//获取输入的值
                sum += score;
            }
            avg = sum / studentNum;
            sum = 0;
            System.out.println("第" + i + "个班级的平均成绩为：" + avg);
        }
    }

}
