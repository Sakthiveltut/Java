package com.practice;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Creating a sorted list of integers
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        // Searching for an element in the list
        int index = Collections.binarySearch(list, 30);

        // Displaying the result
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found. Insertion point: " + (-index - 1));
        }

        // Searching for an element that is not present in the list
        int missingIndex = Collections.binarySearch(list, 35);
        System.out.println(missingIndex);
        // Displaying the result
        if (missingIndex >= 0) {
            System.out.println("Element found at index: " + missingIndex);
        } else {
            System.out.println("Element not found. Insertion point: " + (-missingIndex - 1));
        }
    }
}


