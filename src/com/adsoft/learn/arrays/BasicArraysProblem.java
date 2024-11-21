package com.adsoft.learn.arrays;

import java.util.Arrays;

/**
 * The type Basic arrays problem.
 */
public class BasicArraysProblem {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        sumOfArray();
        findMaxEleFromArray();
    }

    private static void sumOfArray() {
        int[] arr = {2, 6, 4, 7};
        int sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        System.out.println("sum of given arrays: " + sum);
    }

    private static void findMaxEleFromArray() {
        int[] arr = {5, 6, 7, 9, 8, 2};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max element from given array :" + max);
    }
}
