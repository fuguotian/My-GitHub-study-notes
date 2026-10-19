package edu.lzit.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        /*
        时间转换
        描述：给定秒数seconds，将其转换为对应的小时数，分钟数秒数，使得总时间不变，
              但分钟和秒数都不超过59
        输入描述
            在一行中输入一个整数seconds，表示要转换的秒数，满足0<=seconds<=10^8
        输出秒数
            一行 包含三个整数，依次为输入整数对应的小时数，分钟数和秒数（可能为零），中间用一个空格隔开
         */

        //1。定义秒数‘
         int seconds = 3661;
         //1分钟= 60秒 1h=60min=3600秒
        //计算得到小时数
        //3661/3600=1^^^61 通过得到的小时数为1余61
        int hours = seconds / 3600;  //3661/3600=1……61
        System.out.println(hours);
        //计算得到分钟数
        //总秒数-小时数 3661-3600=61
        //1min=60s  61/60=1分钟……1秒
        //3661%3600得到的余数为61，61/60得到1
            int min = seconds % 3600 / 60;
            System.out.println(min);
        //计算秒数
            int second = seconds % 60;
            //int sesond = seconds / 3600
        System.out.println(second);

        //字符串拼接的形式打印数据
        System.out.println(hours+"小时"+min+"分钟"+second+"秒");
    }
}
