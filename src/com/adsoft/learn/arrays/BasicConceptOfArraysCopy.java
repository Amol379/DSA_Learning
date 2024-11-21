package com.adsoft.learn.arrays;

public class BasicConceptOfArraysCopy {

    //print arrays function
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        System.out.println("Original Arrays: ");
        printArray(arr);
        //Trying to copy array
        int[] arr2 = arr;
        System.out.println("Copying Arrays in arr2: ");
        printArray(arr2);

        System.out.println("After Changed value in arr2 -");

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original Arrays without modified arr :");
        printArray(arr);
        System.out.println("After modified copying arrays arr2 :");
        printArray(arr2);

        //value a is not changed bcz its passing the only value not reference
        int a = 5;
        changeVal(a);
        System.out.println("value inside main(): " + a);

        //arrays values are changed because array copy to the reference,pass by reference not possible in java
        // but in stack when we trying to changed value in array stack memory provide the copy reference to the
        // changedArraysVal function and they are changed the element inside heap

        System.out.println("original arrays values: ");
        printArray(arr);
        changeArraysVal(arr);
        System.out.println("after Change arrays values");
        printArray(arr);

        int arr3[] = new int[5];
        arr3[0] =1;
        arr3[1] =2;
        arr3[2] =3;
        arr3[3] =4;
        arr3[4] =5;

        System.out.println("original arrays values: ");
        printArray(arr3);
        int [] arr4 = arr3.clone();
        arr4[0]=6;
        arr4[1]=7;
        System.out.println("after Change arrays values");
        printArray(arr4);
        printArray(arr3);
    }

    private static void changeVal(int a) {
        a = 100;
        System.out.println("value inside changeval(): " + a);
    }

    private static void changeArraysVal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        // printArray(arr);
    }


}
