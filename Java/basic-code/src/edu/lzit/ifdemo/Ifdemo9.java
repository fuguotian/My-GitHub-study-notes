package edu.lzit.ifdemo;

import java.util.Scanner;

public class Ifdemo9 {
    public static void main(String[] args) {
        /*
         键盘任意录入3个大于0的数，判断这三个数值可以构成什么三角形
         需要判断的类型如下
            等边 等腰 直角 普通 无效
            三角形构成的条件  任意两边之和大于第三边
                a+b>c || a+c>b || b+c>a
          细节1：现实生活经验有可能代码是相反的我们要梳理好逻辑
          细节2：if第三种格式下存在多个判断的范围如果有重叠
                等边 < 等腰
                A范围 < B范围
                ！！！！小范围写在上面，大范围写在下面
                先判断等边再判断等腰
         */


        //1.定义变量记录3个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double a = scanner.nextDouble();
        System.out.println("请输入第二个数：");
        double b = scanner.nextDouble();
        System.out.println("请输入第三个数：");
        double c = scanner.nextDouble();
    }
}
