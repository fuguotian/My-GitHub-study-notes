package edu.lzit.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        /*
        算数运算符的三种情况
            1.数字运算
                ***类型不一样的不能运算，需要转成同类型的才能计算
                    *类型转换           byte < short < int < long < float < double
                        1）小--->大   *隐式转换        前面补0
                触发机制： 不同类型的数据进行计算时，默认采取隐式转换，java自动转换，无需我们写代码
                            步骤1：如果有byte,short类型的数据，先提升为int类型
                            步骤2：把取值范围小的提升为取值范围大的，再进行运算
                            byte < short < int < long < float < double
                         2）大--->小  强制转换  *显式转换
                触发机制：  强制转换不会自动触发，需要手动书写代码
                            书写格式：目标数据类型 变量名 = （目标数据类型）被强制转换的数据
                            书写格式：目标数据类型 变量名 = （目标数据类型）被强制转换的数据
                            书写格式：目标数据类型 变量名 = （目标数据类型）被强制转换的数据
                            byte a = 10;             byte a= 10;
                            byte b = (byte) a;       byte b =20;
                                                     byte x = (byte)(a+b)
            2.字符运算
            3.字符串运算
         */
    }
}
