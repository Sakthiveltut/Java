package com.cheat_sheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q07 {

	public static void main(String[] args) {
		int[] input = {4,4,2,3,4,1,2,1,5,5};
		int[] input2 = {4,4,2,4,3,4,1,3,3,2,1,5,5,0,0};
		int length = input.length;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<length;i++) {
			int currentValue = input[i];
			int count = 1;
			if(!map.containsKey(currentValue)) {
				for(int j=i+1;j<length;j++) {
					if(currentValue==input[j]) {
						count++;
					}
				}
				map.put(currentValue,count);
				count=0;
			}
		}
		System.out.println(map);
		int index = 0;
		while(0<map.size()) {
			Integer currentValue = null, currentKey = null;
			for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
				if(currentValue==null) {
					currentValue = entry.getValue();
					currentKey = entry.getKey();
				}if(currentValue < entry.getValue()) {
					currentKey = entry.getKey();
					currentValue = entry.getValue();
				}if(currentValue==entry.getValue()) {
					if(currentKey>entry.getKey()) {
						currentKey = entry.getKey();						
					}
				}
			}
			for(int i=0;i<currentValue;i++) {
				input[index++] = currentKey;
			}
			System.out.println(currentKey+" "+currentValue);
			map.remove(currentKey);
		}
		System.out.println(Arrays.toString(input));
	}
}
