package com.niukebiancheng;

/**
*@Description: 斐波那契数列
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
*@Author： dyy
*/
刷题
public class Fibonacci {
    public static void main(String[] args){
        System.out.println(Fibonacci(5));
    }
    public static int Fibonacci(int n) {
        //当n=0时返回0
        if(n==0){
            return 0 ;
        }
        //当n=0或1时返回1（斐波那契数列的前两个数字都为1）
        if(n==0||n==1){
            return 1;
        }
        //采用递归（从第2项开始为前面两项的和）
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
