package com.adsoft.learn.stack;

import java.util.Stack;

//copy content of one stack to another stack in same order
public class CopyStackSameOrder {
    public static void main(String[] args) {

        Stack<Integer> ele = new Stack<>();
        ele.push(1);
        ele.push(2);
        ele.push(3);
        ele.push(4);
        ele.push(5);
        System.out.println("print original stack ele :" + ele);

        Stack<Integer> revEle = new Stack<>();

        while (!ele.isEmpty()) {
            revEle.push(ele.pop());
        }
        System.out.println("Reverse the element using diff stack :" + revEle);

        Stack<Integer> expectOP = new Stack<>();

        while (!revEle.isEmpty()) {
            expectOP.push(revEle.pop());
        }
        System.out.println("expected copy stack with same order :" + expectOP);

    }
}
