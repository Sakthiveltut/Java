package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original ArrayList: " + fruits);

        // Insert an element at a specific index
        fruits.add(1, "Mango");

        System.out.println("ArrayList after adding Mango at index 1: " + fruits);

        // Insert another element at the start of the list
        fruits.add(0, "Grapes");

        System.out.println("ArrayList after adding Grapes at index 0: " + fruits);
    }
}
