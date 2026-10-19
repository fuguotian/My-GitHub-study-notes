package edu.lzit.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
    /*
    我方：叉子               对方：长矛
    攻击：220                攻击：210
    防御：85                  防御：80
    血量：1012.5               血量：1223.3
    技能加成：1.2                      技能加成：1.3
    技能造成的伤害公式为 ：攻击力 * 技能加成 - 对方防御力
    普攻造成的伤害公式为 ：攻击力 - 对方防御力

    计算：
        我方第一次进行普通攻击，造成多少伤害 对方还剩多少血量
        我方第二次进行技能攻击，造成多少伤害 对方还剩多少血量
     规则：
        经常发生改变的数据，应该使用变量
    */

        //1. 定义变量 记录我方的攻击力
        int Attack1 = 220;
        //2. 定义变量 记录对方的防御力
        int Defense1 = 85;
        //3.定义变量 记录我方的血量
        double blood1 = 1212.5;
        //4.定义变量 记录技能加成
        double skill1 = 1.2;
        //5.定义变量 记录对方的攻击力
        int Attack2 = 210;
        //6.定义变量 记录对方的血量
        double blood2 = 1223.3;
        //7.定义变量 记录对方的防御力
        int Defense2 = 80;
        //8.定义变量 记录技能加成
        double skill2 = 1.3;

        //9.我方第一次进行普通攻击，造成多少伤害 对方还剩多少血量
        //普攻造成的伤害公式为 ：攻击力 - 对方防御力
        double demage1 = Attack1 - Defense2;
        blood2 = blood2 - demage1;
        System.out.println(blood2);//1083.3
        //10.我方第二次进行技能攻击，造成多少伤害 对方还剩多少血量
        //技能造成的伤害公式为 ：攻击力 * 技能加成 - 对方防御力
        double demage2 = Attack1 * skill1 - Defense2;
        blood2 = blood2 - demage2;
        System.out.println(blood2);//953.3
    }
}


