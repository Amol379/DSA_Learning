package com.adsoft.learn.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * The type Basic understanding.
 */
public class BasicUnderstanding {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int sizeOfStack = sc.nextInt();
        System.out.println("Enter the Elements: ");
        Stack<Integer> ele = new Stack<>();
        while (sizeOfStack > 0){
            ele.push(sc.nextInt());
            sizeOfStack--;
        }
        System.out.println(ele);
        System.out.println("peek pout the ele :"+ele.peek());//it will return the top element
        System.out.println("pop out the ele :"+ele.pop());//it will return the top element and removed it
        System.out.println("After the pop :"+ele);
        System.out.println("checking stack isEmpty"+ele.isEmpty());//it will check stack is empty or not,if empty it return true
        System.out.println(ele.push(6));//it will add new element on top of the stackṅ
        System.out.println("after pust ele :"+ele);
        System.out.println("checking size of stack :"+ele.size());
    }


}
