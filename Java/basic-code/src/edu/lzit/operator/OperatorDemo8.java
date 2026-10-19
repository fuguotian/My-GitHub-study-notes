package edu.lzit.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {

       /*
       自增和自减运算符
        int a = 10;
        a++;
        ++a;
        --a;
        a--;
        a--;
        System.out.println(a);*/


        /*
        赋值运算符
            =   直接赋值    int a=10; 将10赋值给a
            +=   加后赋值   a+=b; 就是a=a+b，将a+b的值赋值给a
            -=   减后赋值   a-=b; 就是a=a-b，将a-b的值赋值给a
            *=   乘后赋值   a*=b; 就是a=a*b，将a*b的值赋值给a
            /=   除后赋值   a/=b; 就是a=a/b，将a/b的商赋值给a
            %=   取余后赋值   a%=b; 就是a=a%b，将a%b的余数赋值给a
        */

        int a = 10;
        int b = 20;
        a+=b;
        System.out.println(a);
        System.out.println(b);
    }
}
