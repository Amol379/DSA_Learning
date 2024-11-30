package com.adsoft.recursion;

public class Recursion_1 {

    static int sum = 0;

    public static void main(String[] args) {
        printIncrementNumber(5);
        System.out.println();
        sumNumber(5);
        printDecrementNumber(5);
        findFactorial(5, 1);
        int fact = findFactorial(5);
        System.out.println("fact is : " + fact);
        System.out.println("fibonacci element on exact location : " + fibonacci(5));
        System.out.println("fibonacci series is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("sum of digits :" + sumOfDigits(54321));
        System.out.println("count no of digits : " + countOfDigit(123456));
    }

    private static void printIncrementNumber(int x) {
        if (x < 1) {
            return;
        }
        printIncrementNumber(x - 1);
        System.out.print(x + " ");

    }

    private static void sumNumber(int x) {
        sum = sum + x;
        if (x <= 0) {
            System.out.println("sum : " + sum);
            return;
        }
        sumNumber(x - 1);
    }

    private static void printDecrementNumber(int x) {
        if (x < 1) {
            return;
        }
        System.out.print(x + " ");
        printDecrementNumber(x - 1);
    }

    private static void findFactorial(int x, int fact) {
        if (x == 0) {
            System.out.println(1);
            System.out.println(fact);
            return;
        }
        fact = fact * x;

        findFactorial(x - 1, fact);
    }

    private static int findFactorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * findFactorial(x - 1);
    }

    private static int fibonacci(int x) {
        //0 1 1 2 3 5
        if (x == 0 || x == 1) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    private static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9)
            return n;
        return sumOfDigits(n / 10) + n % 10;
        //(n / 10) --> return whole number except last digit eg 1234 return value is 123
        // + n % 10-->return the last element of the number eg 1234 return value is 4
    }

    private static int countOfDigit(int n) {

        if (n == 0)
            return 0;
        return 1 + countOfDigit(n / 10);
    }

}
