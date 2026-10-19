package edu.lzit.literal;
//字面量 literal   程序中的数据
//    /*
//    * 字面量类型
//    * 整数，小数，字符，字符串，字符，布尔值，空
//    * 大致分为三类：数值型，文本型，布尔型
//    *
//    * 整数，小数直接书写
//    * 字符，字符串用引号括起来
//    *   如果进行加减乘除直接写，如果是字符串会进行拼接
//    *       如果文本的内容只有一个字符，那么用单引号括起来 这个叫字符，有且只有一个 '男' 'a' '1'
//    * 布尔值：true，false
//    * 空：null
//    *   什么都没有
//    * */
public class LiteralDemo1 {
    public static void main(String[] args) {
    //输出萧炎信息  萧炎 19岁 60.5 男

        //输出萧炎的名字
        System.out.println("萧炎");
        //输出萧炎的年龄
        System.out.println(19);
        //输出萧炎的体重
        System.out.println(60.5);
        //输出萧炎的性别
        System.out.println("男");
    }
}
