package com.eku.test;

public class Fibbonacci {

    // f(n) = f(n -1) + f(n - 2);
    // f(0) = 1; f(1) = 1;
    // 1, 1, 2, 3, 5, 8, 13, 21
    // 0, 1, 2, 3, 4, 5, 6, 7
    public static void main(String[] args) {

        int n = 700;
        System.out.println("Result = " + fibbonaciLoop(n));

    }

    // too slow
    private static int fibbonaciRecursive(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return fibbonaciRecursive(n - 1) + fibbonaciRecursive(n - 2);
    }

    // very fast
    private static int fibbonaciLoop(int n) {

        int n0 = 1;
        int n1 = 1;
        int result = 1;

        for (int i = 0; i < n - 1; i++) {

            result = n0 + n1;
            n0 = n1;
            n1 = result;

        }

        return result;
    }
}
