package com.ChapterSixteen;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(12L);
        System.out.println("pushed 12L");
        printStack(stack);
        stack.push(34567);
        System.out.println("pushed 34567");
        printStack(stack);
        stack.push(1.0F);
        System.out.println("pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678);
        System.out.println("Push 1234.5678");
        printStack(stack);

    }
        public static void printStack(Stack<Number> stack){
            if(stack.isEmpty()){
                System.out.println("stack is empty");
            }
            else
                System.out.printf("stack contains:%s(top)%n",stack);
        }




}
