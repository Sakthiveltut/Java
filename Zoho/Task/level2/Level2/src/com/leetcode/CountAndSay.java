package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountAndSay {
	
	public static void main(String[] args) {
		CountAndSay object = new CountAndSay();
		System.out.println(object.countAndSay(6));
	}

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 0; i < n - 1; i++) {
            char currentValue = result.charAt(0);
            StringBuilder s = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (currentValue != result.charAt(j)) {
                    s.append(count);
                    s.append(currentValue);
                    count = 0;
                    currentValue = result.charAt(j);
                }
                count++;
            }
            s.append(count);
            s.append(currentValue);
            result = s.toString();
        }
        return result;
    }
}


