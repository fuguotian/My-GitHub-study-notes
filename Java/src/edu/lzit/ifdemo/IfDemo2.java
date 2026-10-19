package edu.lzit.ifdemo;

import java.util.Scanner;

public class IfDemo2 {

    public static void main(String[] args) {
        /*
            需求：初始生命为200,受到X点伤害，技能恢复Y点伤害，X和Y由键盘录入而来
            假设 游戏人物不会死亡 最少1点血
            问，最终游戏人物的生命是多少？
         */
            //1.定义初始生命为200
        int hp = 200;
        //2.受到X点伤害，通过键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前所受到的伤害：");
        int damage = sc.nextInt();//！！！存在bug
        //3.计算当前血量
        hp = hp - damage;
        if(hp <= 0){
            hp = 1;
        }
        System.out.println("当前血量为"+hp);
        //4.恢复血量Y点，键盘录入
        System.out.println("请输入当前恢复的血量");
        int add = sc.nextInt();
        //计算当前人物血量
        hp = hp + add;
        if(hp > 200){
            hp = 200;
        }
        System.out.println("当前人物的血量为"+hp);
        }
    }

