package com.adsoft.learn.arrays;

import java.util.Scanner;

public class TakingArrayFromUsers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + "element in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}
