package com.niukebiancheng;

import java.util.Stack;

/**
*@Description: 两个栈实现一个队列(完成队列的插入和删除)
*@Author： dyy
*/
public class StackComQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //队列的插入（直接stack1当作入栈队列来进行插入）
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        //stack1和stack2同时为null时，出队列的操作则不能执行
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is null");
        }
        //stack2为空但是stack1不为空时，执行入队操作
        if(stack2.empty()){
            while (!stack1.empty()){
               //进行入队操作（将stack1中的元素转移到stack2中，再执行stack2的入栈操作）
                stack2.push(stack1.pop());
            }
        }
        //对stack2进行出栈操作
        return stack2.pop();
    }
}
