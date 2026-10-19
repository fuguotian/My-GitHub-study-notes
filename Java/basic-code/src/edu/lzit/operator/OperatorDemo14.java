package edu.lzit.operator;

import java.util.Scanner;

public class OperatorDemo14 {
    public static void main(String[] args) {
        /*
        三元运算符
            格式：关系表达式？表达式1：表达式2；
            计算规则
                先计算关系表达式的值
                如果关系表达式的值为true，则计算表达式1的值
                如果关系表达式的值为false，则计算表达式2的值
         */

        //利用三元运算符 求两个整数的较大值
        //1.定义两个整数
            //格式：关系表达式？表达式1;表达式2；
            int a = 10;
            int b = 20;
        //2.利用三元运算符求两个整数的较大值
            int max = a>b?a:b;
        System.out.println(max);
    }
}
