package com.adsoft.learn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountNoOfOccurrence {
    public static void main(String[] args) {
       /* int[] arr = {1, 2, 3, 5, 4, 5, 4, 5};
        int findOccurrenceNo = 5;*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays :");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of arrays: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the occurrence which you want to count :");

        int x = sc.nextInt();
        countOccurrence(arr, x);

        System.out.println("Enter the element which you want to find last occurrence :");

        int y = sc.nextInt();
        findLastOccurrence(arr, y);

        findEleGTGivenNum(arr, y);

        System.out.println("Is Array Sorted : " + isSorted(arr));

        int[] result = findSmallestAndGreatestValue(arr);
        System.out.println(Arrays.toString(result));
    }

    private static void countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        System.out.println("Number of Occurrence ele " + x + " is times: " + count);
    }

    private static void findLastOccurrence(int[] arr, int ele) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                index = i;
            }
        }
        System.out.println("Last occurance of " + ele + " is :" + index);

    }

    //count the number of element strictly greater than given value
    private static void findEleGTGivenNum(int[] arr, int x) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                count++;
            }
        }
        System.out.println(x + " Greater Number count is :" + count);
    }

    //check the given array is sorted or not
    private static boolean isSorted(int[] arr) {
        //[1,2,3,3]
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }


    private static int[] findSmallestAndGreatestValue(int[] arr) {
        int[] ans = new int[2];
//todo-will solve using Arrays.sort
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ans[0] = arr[i - 1];
            } else {
                ans[1] = arr[i];
            }
        }
        return ans;
    }
}
