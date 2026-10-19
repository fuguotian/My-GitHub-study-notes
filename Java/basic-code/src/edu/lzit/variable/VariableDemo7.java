package edu.lzit.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        /*
        题目 键盘输入并且求和
            定义两个数据类型的变量num1,num2，键盘录入数据分别为两个变量赋值
            求两个数的和并进行打印
        * */
        //1.找到Scanner
        Scanner sc = new Scanner(System.in);


        //2.让Scanner干活
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();
        System.out.println(num1);

        //让scanner接受第二个整数
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2);

        //4求和
        int sum = num1 + num2;
        System.out.println("两个数的和为：" + sum);
    }
}

