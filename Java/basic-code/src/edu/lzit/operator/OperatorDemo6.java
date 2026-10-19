package edu.lzit.operator;

public class OperatorDemo6 {
     public static void main(String[] args) {
         //字符运算
     /*
     实现字母的大小写转换，例如：A转换为a，
     在ASCII码表中a为97，A为65，二者之间相差32
      */

         // 1，定于变量记录大写的字符
         char c = 'A';
         //转换为小写
         //65+32=97 运算过程中，c是char类型，会自动提升为int类型，所以32也可以写成0x20
         char c1 = (char)(c + 32);
         System.out.println(c1);
     }
}
