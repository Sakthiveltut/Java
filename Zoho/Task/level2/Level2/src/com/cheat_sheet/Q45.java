package com.cheat_sheet;

public class Q45 {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date", "abcde","abcd"};
        bubbleSort(words);
        System.out.println("Sorted array: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (compare(arr[j], arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);
        
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return len1 - len2;
    }

}

