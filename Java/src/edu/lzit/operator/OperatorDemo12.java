package edu.lzit.operator;

import java.util.Scanner;

public class OperatorDemo12 {
    public static void main(String[] args) {
        /*
            短路运算符
             && 当左边为false时，右边不再判断
             || 当左边为true时，右边不再判断
             运行规则：和单个的&& ||是一样的。只不过提高了效率

                //需求1：键盘录入一个四位整数。判断这个数字是不是回文数

                //需求2.寻找7的有缘数，定义一个两位整数，主要该数字包含7或者是7的背书，就是7的有缘数
         */

        //需求1：键盘录入一个四位整数。判断这个数字是不是回文数

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int number = scanner.nextInt();

        //判断number是不h是回文数
        //对称性
        int ge = number % 10;
        int shi = number /10 % 10;
        int bai = number /100 % 10;
        int qian = number /1000 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);
        //开始判断
            //qian=ge shi=bai
        boolean result = qian == ge && shi == bai;
        System.out.println(result + "他是一个回文数");
    }
}
