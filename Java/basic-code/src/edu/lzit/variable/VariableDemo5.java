package edu.lzit.variable;

public class VariableDemo5 {
    public static void main(String[] args) {
         //bmi = 体重 / 身高的平方
        //1.定义体重
        double weight = 93;
        //2定义变量记录我的身高
        double height = 1.70;
        //3.计算 bmi
        double bmi = weight / (height * height);
        System.out.println(bmi);

        //扩展
        //计算出你当前的身高，在标准的BMI下最多是多少千克？
        double maxWeight = height * height * 25;
        System.out.println(maxWeight);




        /*
        Java语言数据类型的分类
            基本数据类型          引用数据类型
        基本数据类型的四类八种
            byte/short/int/long    float/double     char    boolean
        整数，小数取值范围大小关系
            double>float>long>int>short>byte
        long float类型的变量后面加后缀
            long l = 10000000000L;
            float f = 12.3F;

        * */



    }
}
