package edu.lzit.variable;

public class VariableDemo4 {
    /*
       Java的基本数据类型
       1.整数类型
           byte    -128 ~ 127  1个字节
          ## short   -32768 ~ 32767  2个字节
           int     -2147483648 ~ 2147483647  4个字节
           long    -9223372036854775808 ~ 9223372036854775807  8个字节
       2.浮点类型（小数）
           float   4个字节
          ## double  8个字节
       3.字符类型
           char    2个字节
       4.布尔类型
           boolean   1个字节

   * */
    public static void main(String[] args) {
        //变量的定义格式
        //数据类型 变量名 = 数据值；

        //1.定义byte类型的变量
        byte b = 10;
        System.out.println(b);
        //2.定义short类型的变量
        short s = 1000;
        System.out.println(s);
        //3.定义int类型的变量
        int i = 10000;
        System.out.println(i);
        //4.定义long类型的变量
        //细节： long类型数据必须以L结尾，可以是大写，也可以是小写
        long l = 10000000000L;
        System.out.println(l);

        //5.定义浮点类型float double
        //浮点类型的变量 必须以F或者f结尾
        float f = 12.3F;
        System.out.println(f);
        double d = 12.3;
        System.out.println(d);
        //6.定义字符类型char
        char c = 'a';
        System.out.println(c);
        //7.定义布尔类型boolean
        boolean bool = true;
        System.out.println(bool);
    }
}
