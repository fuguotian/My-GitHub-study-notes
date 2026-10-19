package edu.lzit.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        /*
        外卖优惠券
            需求：小明在每次订外卖都会在多家平台对比，看谁的优惠力度大
            已知:
               饱了么：全场9折优惠
               美单：满30减10元
            请问1：小明买了一顿烧烤50元，在哪家下单更划算
            请问2：如果价格不确定，数据由键盘录入而来呢？

            细节：变量只在所属的大括号有效
         */

        //1.定义一个变量price，表示烧烤的价格
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入烧烤的价格");
        double price = scanner.nextDouble();

        //2.定义两个变量，分别表示饱了么和美单的优惠价格
        double priceBaolm = price * 0.9; //九折优惠
        System.out.println("饱了么优惠价格为：" + priceBaolm);
        double priceMeiD = 0;
        if(price>30){
            priceMeiD = price - 10;//满30减10
        }else{
            priceMeiD = price;
        }
        System.out.println("美单优惠价格为：" + priceMeiD);

        //3.比较两个优惠价格，输出更划算的那一家
        if(priceBaolm < priceMeiD){
            System.out.println("在饱了么下单更划算");
        }else{
            System.out.println("在美单下单更划算");
        }
    }
}
