package com.adsoft.learn.stack;

import java.util.Stack;

//Insert the element on stack inside bottom of the stack
public class InsertEleAtBottom {
    public static void main(String[] args) {
        /*
        i/p=>[1, 2, 3, 4, 5]
        o/p=>[6,1, 2, 3, 4, 5]
         */
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack elements :" + stack);
        Stack<Integer> tempStack = new Stack<Integer>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        System.out.println("TempStack : " + tempStack);
        stack.push(6);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        System.out.println("added :" + stack);

        //calling method
        int index = 2;
        int element = 10;
        insertEleAtAnyIndex(stack, index, element);
    }

    //insert element at specific position/index
    private static void insertEleAtAnyIndex(Stack<Integer> st, int index, int element) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > index) {
            temp.push(st.pop());
        }
        st.push(element);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
