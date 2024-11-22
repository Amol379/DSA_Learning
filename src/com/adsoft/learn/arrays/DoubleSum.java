package com.adsoft.learn.arrays;

public class DoubleSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        findValueUsingTwoOccurrence(arr, 7);

        int[] arr1 = {1, 2, 3, 1, 2, 4};
        findUniqueEle(arr1);

        int[] arr2 = {1, 2, 3, 1, 2, 4, 5, 5};
        System.out.println("Largest value is :" + findLargestEle(arr2));

        int[] arr3 = {1, 2, 3, 1, 2, 6, 7, 8, 8, 9};
        findSecondLargeEle(arr3);

        int[] arr4 = {1, 2, 3, 3, 4, 5, 4};
        System.out.println("First Repeating occurrence is :" + findFirstRepeatingNumber(arr4));

        int[] arr5 = {1, 2, 3, 3, 4, 5, 4, 1, 6, 7, 6};
        System.out.println("First Repeating occurrence is :" + findLastRepeatingNumber(arr5));
    }
    //find the given value to addition 2 number 2+3=5

    private static void findValueUsingTwoOccurrence(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == x) {
                    System.out.println(arr[i] + " : " + arr[j]);
                }
            }
        }
    }

    private static void findUniqueEle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > 0) {
                System.out.println("Unique element is : " + arr[k]);
            }
        }
    }

    private static int findLargestEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    private static void findSecondLargeEle(int[] arr) {
        int max = findLargestEle(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                arr[i] = Integer.MIN_VALUE;
        }
        int secondLargestNumber = findLargestEle(arr);
        System.out.println("Second Largest Number is :" + secondLargestNumber);

    }

    private static int findFirstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    private static int findLastRepeatingNumber(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }

            }
        }
        return ans;
    }
}
