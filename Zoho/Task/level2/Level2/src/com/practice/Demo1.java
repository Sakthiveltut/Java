package com.practice;

import java.util.Arrays;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 50;
        int max = 104;

        // Generate random number between min (inclusive) and max (inclusive)
        int randomNumber = random.nextInt((max - min) + 1) + min;

        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}
  





