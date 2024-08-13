package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q556NextGreaterElementIII {

	public static void main(String[] args) {
		System.out.println(nextGreaterElement(718420));
	}
	
    public static int nextGreaterElement1(int n) {
        int temp = n, remainder=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp>0){
            remainder=temp%10;
            list.add(remainder);
            temp/=10;
        }
        
        for(int i=0;i<list.size()-1;i++) {
        	if(list.get(i)>list.get(i+1)) {
        		nextGreatestDigit(i+1, list);
        		break;
        	}
        }
        long result = 0;
        for(int i=list.size()-1;i>=0;i--) {
        	result=result*10+list.get(i);
        }
        System.out.println(list);
        System.out.println("result "+result);
        
        return (result==n || result<0 || result>Integer.MAX_VALUE)?-1:(int)result;
    }

	private static void nextGreatestDigit(int position, ArrayList<Integer> list) {
		int maxPosition = 0;
		boolean hasMaxDigit = false;
		for(int i=0;i<position;i++) {
			System.out.println(list.get(i)+" "+list.get(position));
			if(list.get(i)>list.get(position) && !hasMaxDigit) {
				maxPosition = i;
				hasMaxDigit =true;
			}else if(hasMaxDigit && list.get(maxPosition)>list.get(i) ) {
				maxPosition = i;
			}
		}
		swap(position,maxPosition, list);
		list.subList(0, position).sort(Collections.reverseOrder());
	}

	private static void swap(int position, int maxPosition, ArrayList<Integer> list) {
    	int temp1 = list.get(position);
    	list.set(position, list.get(maxPosition));
    	list.set(maxPosition, temp1);
	}
	
	
    public static int nextGreaterElement(int n) {
        char[] number = (n + "").toCharArray();
        
        int i, j;

        for (i = number.length-1; i > 0; i--)
            if (number[i-1] < number[i])
               break;
        
        System.out.println("i "+i);
        
        // If no such digit is found, its the edge case 1.
        if (i == 0)
            return -1;
            
         // II) Find the smallest digit on right side of (i-1)'th 
         // digit that is greater than number[i-1]
        int x = number[i-1], smallest = i;
        for (j = i+1; j < number.length; j++)
            if (number[j] > x && number[j] <= number[smallest])
                smallest = j;
        
        // III) Swap the above found smallest digit with 
        // number[i-1]
        char temp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest] = temp;
        
        // IV) Sort the digits after (i-1) in ascending order
        Arrays.sort(number, i, number.length);
        
        long val = Long.parseLong(new String(number));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
	
}
