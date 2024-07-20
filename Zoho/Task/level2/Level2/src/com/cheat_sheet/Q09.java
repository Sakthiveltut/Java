package com.cheat_sheet;

import java.util.Arrays;

public class Q09 {
    public static void main(String[] args) {
        int[] array1 = {5};
        int[] array2 = {3, 4, 7}; 

        int result = findLeastPrimeToAdd(array1[0], array2);

        System.out.println(array1[0]+" "+result);
    }

    public static int findLeastPrimeToAdd(int firstElement, int[] array2) {
        int prime = 2; 
        while (true) {
            boolean divisible = true;
            int newNumber = firstElement + prime;
            for (int num : array2) {
                if (newNumber % num != 0) {
                	System.out.println("prime"+prime+" num "+num);
                    divisible = false;
                    break;
                }
            }
            if (divisible) {
            	System.out.println("newNumber "+newNumber);
                return prime;
            }
            prime = getNextPrime(prime);
        }
    }

    public static int getNextPrime(int currentPrime) {
        int next = currentPrime + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}

