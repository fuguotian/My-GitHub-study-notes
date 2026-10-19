package edu.lzit.operator;

import java.util.Scanner;

public class OperatorDemo13 {
    public static void main(String[] args) {
        /*
            短路运算符
             && 当左边为false时，右边不再判断
             || 当左边为true时，右边不再判断
             运行规则：和单个的&& ||是一样的。只不过提高了效率

                //需求1：键盘录入一个四位整数。判断这个数字是不是回文数

                //需求2.寻找7的有缘数，定义一个两位整数，主要该数字包含7或者是7的背书，就是7的有缘数
         */
        //需求2.寻找7的有缘数，定义一个两位整数，主要该数字包含7或者是7的倍数，就是7的有缘数
        Scanner scanner = new Scanner(System.in);
        //1.定义两个变量
        int number = 11;

        //包含7：个位或者十位是7
        //7的倍数：对7取余为0 number % 7 == 0

        //获取个位十位
        int ge = number % 10;
        int shi = number /10%10;
        //判断当前数字是否为7的有缘数
        //三个条件只要满足其一即可
        boolean result = ge == 7 || shi == 7 || number % 7 == 0;
        System.out.println(result);
    }
}
