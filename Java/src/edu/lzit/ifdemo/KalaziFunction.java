package edu.lzit.ifdemo;

import java.util.Scanner;

public class KalaziFunction {
    public static void main(String[] args) {
        /*卡拉兹函数：
            定义：给定正整数n
            若n是基数，则fn=3n+1
            若n是偶数，则fn=n/2
        */

        //1.确定n从哪里来
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = scanner.nextInt();

        //2.奇偶判断
        if(n % 2 == 0){
            int fn = n / 2;
            System.out.println("偶数");
            System.out.println(fn);
        }else {
            int fn = 3 * n + 1;
            System.out.println("奇数");
            System.out.println(fn);
        }
    }
}
