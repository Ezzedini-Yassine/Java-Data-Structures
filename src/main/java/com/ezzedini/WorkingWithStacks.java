package com.ezzedini;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(35);

        System.out.println(stack.peek()); //peek allows me to check the value of the object on top of the stack
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
