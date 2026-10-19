package edu.lzit.ifdemo;

public class IfDemo3 {
    public static void main(String[] args) {
        /*

        if(关系表达式){
        语句体；
        }
         if的细节
            1.If语句大括号的位置
                左括号写在上一行的末尾，不要单独写一行

                K&R风格 紧凑风 左括号在上一行的末尾
                Allman风格 折叠风 左括号另起一行

            2.If语句大括号的省略
                如果大括号中语句体只有一行，大括号可以省略
            3.小括号后面不能有分号
                小括号后面不能有分号，这样会拆开if的语句结构
            4.判断布尔类型的变量
                判断布尔类型的变量，直接把变量写在小括号里即可
         */

       /* 3.小括号后面不能有分号
        小括号后面不能有分号，这样会拆开if的语句结构*/
        double bodyTemperature = 37.5;
        if(bodyTemperature > 37.5);
        //独立的代码块，if单独执行
        {
            System.out.println("发热");
        }



    }
}
