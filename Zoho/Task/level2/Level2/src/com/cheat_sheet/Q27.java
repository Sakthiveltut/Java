package com.cheat_sheet;

import java.util.Arrays;

public class Q27 {

    public static void modifyAndRearrangeArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        
        arr = result;
        
        System.out.println(Arrays.toString(arr));
        /*for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }*/
    }

    public static void main(String[] args) {
        int[] array = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        System.out.println("Original array: " + Arrays.toString(array));
        modifyAndRearrangeArray(array);
        System.out.println("Modified array: " + Arrays.toString(array));
    }
}
