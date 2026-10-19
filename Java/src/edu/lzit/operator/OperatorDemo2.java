package edu.lzit.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /*
        数值拆分
        需求：键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台
        * */
        System.out.println("请输入一个三位数");
        //如果scanner报错，需要点击scanner，alt+回车修改当前错误，选择第一个import class
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //alt+p 强制让AI自动生成代码
        System.out.println(num);
        //拆分
        //个位
        int ge = num % 10;
        System.out.println("个位是："+ge);
        //十位
        int shi = num /10 % 10;
        System.out.println("十位是："+shi);
        //百位
        //123/100 = 1
        //1 % 100 = 0.......1
        int bai = num / 100 % 10;
        System.out.println("百位是："+bai);

        /*
        公式总结    砍掉末位用/10  想取出末位用%10
        个位：num % 10
        十位：num / 10 % 10
        百位：num / 100 % 10
        千位：num / 1000 % 10
        * */
    }
}
