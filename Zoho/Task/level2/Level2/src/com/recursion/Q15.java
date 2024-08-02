package com.recursion;

public class Q15 {
    public static void main(String[] args) {
        int result = complexRecursion(5);
        System.out.println(result);
    }

    public static int complexRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        if (n % 2 == 0) {
            return complexRecursion(n / 2) + complexRecursion(n - 1);
        } else {
            return complexRecursion(n - 1) - complexRecursion(n / 2);
        }
    }
}
