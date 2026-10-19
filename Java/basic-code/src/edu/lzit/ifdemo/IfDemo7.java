package edu.lzit.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
    public static void main(String[] args) {
        /*
        需求：很多App都有不同的优惠券
        假设：现在有以下优惠券
         全场商品满10减8
         全场商品满50减30
         全场商品满100减50
         全场商品满200减100

        会员卡：全场八折
        请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
         */

        //1.定义一个变量记录商品的价格
        double price = 100;
        //2.定义变量记录使用优惠券后的价格
        double discountPrice = 0;
        //3.计算使用优惠券后的价格
        if(price>=10){
            discountPrice = price - 8;
        }else if (price >= 50){
            discountPrice = price - 30;
        }else if(price>=100){
            discountPrice = price - 50;
        }else if(price>=200){
            discountPrice = price - 100;
        }else{
            discountPrice = price;
        }
        //4.定义变量记录使用会员卡后的价格
        double memberPrice = discountPrice * 0.8;

        //5.比较使用会员卡后的价格和使用优惠券后的价格，返回较小值
        if (memberPrice < discountPrice) {
            System.out.println("使用会员卡后的价格为：" + memberPrice);
        } else {
            System.out.println("使用优惠券后的价格为：" + discountPrice);
        }


    }
}
