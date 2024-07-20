package com.cheat_sheet;

import java.util.HashMap;
import java.util.Map;

public class Q17 {

	public static void main(String[] args) {
		int nums[] = {0,1,0,1,0,1,99};
        Map<Integer,Integer> map = new HashMap<>();
        for(int value:nums){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }else{
                map.put(value,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
	}
}
