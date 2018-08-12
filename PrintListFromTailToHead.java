package com.niukebiancheng;

import java.util.ArrayList;
import java.util.Stack;

/**
*@Description: 从尾到头打印链表
*@Author： dyy
*/
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class PrintListFromTailToHead {
    public static void main(String[] args) {
    }
//解法一：利用栈的特性（先进后出）——我们可以先遍历单链表使得其入栈，而后进行出栈操作
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        //创建栈
        Stack<Integer> stack = new Stack<>();
        //创建新的ArrayList用来保存出栈元素
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = listNode;
        while (temp!=null){
            //入栈操作
            stack.push(temp.val);
            temp = temp.next;
        }
        while (!stack.isEmpty()){
            //栈非空，进行出栈操作并向list中插入元素
            list.add(stack.pop());
        }
        return list;
    }


    //解法二：利用递归操作实现
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        if(listNode!=null){
            //进行递归，直至listNode==null（递归出口）
            this.printListFromTailToHead2(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
