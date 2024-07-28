package com.cheat_sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java Program to find the next greater number same set of
//digits

import java.util.*;

public class NextGreaterNumber {

 static String nextPermutation(String N)
 {
     if (N.length() == 1) {
         return "Not Possible";
     }

     int i;
     for (i = N.length() - 1; i > 0; i--) {
         if (N.charAt(i) > N.charAt(i - 1)) {
             break;
         }
     }

     if (i == 0) {
         return "Not Possible";
     }

     for (int j = N.length() - 1; j >= i; j--) {
         if (N.charAt(i - 1) < N.charAt(j)) {
             char[] charArray = N.toCharArray();
             char temp = charArray[i - 1];
             charArray[i - 1] = charArray[j];
             charArray[j] = temp;
             N = new String(charArray);
             break;
         }
     }
     System.out.println(N);
     char[] charArray = N.toCharArray();
     reverse(charArray, i, N.length() - 1);
     return new String(charArray);
 }

 static void reverse(char[] arr, int start, int end)
 {
     while (start < end) {
         char temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
     }
 }

public static void main(String[] args)
 {
     // Sample Input
     String N = "34724536";

     // Function Call
     System.out.println(nextPermutation(N));
 }
}


