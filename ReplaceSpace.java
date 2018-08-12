package com.niukebiancheng;

import java.util.Scanner;

/**
*@Description: 将字符串中所有的空格替换为%
*@Author： dyy
*/

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(replaceSpace1(new StringBuffer(str1)));
        System.out.println(replaceSpace2(new StringBuffer(str1)));
    }

    //解法一
    public static String replaceSpace1(StringBuffer str){
        //将StringBuffer转化为String
        String string =  str.toString();
        //将String类型转化为数组类型
        char[] ch = string.toCharArray();
        //定义初始化新的StringBuffer
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <ch.length;i++){
            //若未空格，则令新StringBuffer中的元素变为“%20”
            if(ch[i]==' '){
                sb.append("%20");
            }else{
                //非空格直接拼接
                sb.append(ch[i]);
            }
        }
        //将StringBuffer类型转化为String类型
        return sb.toString();
    }

//解法二
    public static String replaceSpace2(StringBuffer str){
        //直接将StringBuffer类型转化成String类型，使用替换函数replaceAll
        return str.toString().replaceAll(" ","%20");
    }
}
