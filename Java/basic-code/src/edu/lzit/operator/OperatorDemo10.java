package edu.lzit.operator;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {
        /*
        逻辑运算符
            && 逻辑与 同时成立才是符合要求的
            || 逻辑或  只有一个符合要求即可
            ! 逻辑非   取反

         */
        //练习1.键盘录入一个整数，判断这个数字是否在1-10之间
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
         int number = scanner.nextInt();
         //判断number > 1 & number <10
        boolean result1 = number >= 1 & number <= 10;
        System.out.println(result1);
        //练习2键盘录入一个整数，判断这个数组是否不在1-10之间
    }
}
