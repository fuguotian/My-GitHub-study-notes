package edu.lzit.ifdemo;

public class IfDemo1 {
    public static void main(String[] args) {
        /*
            定义一个变量表示人的体温，对体温进行判断是否大于等于38°，如果超过打印语言警告
         */
        double tiwen= 38.8;
        System.out.println("当前体温为："+tiwen);
        if(tiwen>=38){
            System.out.println("语音警告");
        }
    }
}
