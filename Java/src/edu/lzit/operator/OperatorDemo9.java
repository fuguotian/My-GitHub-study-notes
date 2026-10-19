package edu.lzit.operator;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args) {
        /*
        关系运算符
            ==  a==b 判断a是否等于b
            !=  a!=b 判断a是否不等于b
            >   a>b 判断a是否大于b
            <   a<b 判断a是否小于b
            >=  a>=b 判断a是否大于等于b
            <=  a<=b 判断a是否小于等于b     结果均为true和false 成立和不成立
         */

        /*
            练习1.键盘录入你和好基友的身高，比比谁更高

            练习2.键盘录入一个3位数，判断能否被3整除
         */

        //练习1
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的身高：");
        double yourHeight = scanner.nextDouble();
        System.out.print("请输入你的好基友的身高：");
        double friendHeight = scanner.nextDouble();
        if (yourHeight > friendHeight) {
            System.out.println("你更高");
        } else {
            System.out.println("你的好基友更高");
        }*/

        //练习2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = scanner.nextInt();
        if(number % 3 == 0){
            System.out.println(number+"可以被3整除");
        }else{
            System.out.println(number+"不能被3整除");
        }*/

        //练习2关系运算符写法
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = scanner.nextInt();

        //拆分数字
        int ge = number %10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        //求和
        int sum = ge + shi + bai;
        //判断能否被3整除
        boolean result = sum % 3 == 0;
        System.out.println(result);
    }
}
