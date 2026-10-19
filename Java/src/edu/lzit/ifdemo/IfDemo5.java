package edu.lzit.ifdemo;

public class IfDemo5 {
    public static void main(String[] args) {
        /*
        判断语句第二种格式

            if(关系表达式){
                语句体A;
            }else{
                语句体B;
            }
           练习：考试成绩
            需求：定义一个小数表示考试成绩
            判断学生的考试成绩，如果大于等于60分输出通过否则不通过

         */
        //1.定义一个小数表示考试成绩
        double score = 90;

        //
        if (score >= 60 && score <= 100){
            //2.判断
            if(score >= 60){
                System.out.println("考试通过");
            }else{
                System.out.println("考试不通过");
            }
        }else {
            System.out.println("成绩不合理");
        }


    }
}
