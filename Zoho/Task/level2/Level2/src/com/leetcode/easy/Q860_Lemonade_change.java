package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Q860_Lemonade_change {

	public static void main(String[] args) {
		//System.out.println(lemonadeChange(new int[] {5,5,5,10,20}));
		//System.out.println(lemonadeChange(new int[] {5,5,10,10,20}));
		//System.out.println(lemonadeChange(new int[] {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
		//System.out.println(lemonadeChange(new int[] {5,5,5,10,5,5,10,20,20,20}));
				
	}
	
	public static boolean lemonadeChange1(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<bills.length;i++) {
			if(bills[i]==10) {
				int change = map.getOrDefault(5, 0);
				if(change>0) {
					map.put(5, change-1);
					map.put(bills[i], map.getOrDefault(bills[i], 0)+1);
				}
				else return false;
			}else if(bills[i]==20) {
				int change5 = map.getOrDefault(5, 0);
				int change10 = map.getOrDefault(10, 0);
				if(change10>0 && change5>0) {
					map.put(5, change5-1);
					map.put(10, change10-1);
					map.put(bills[i], map.getOrDefault(bills[i], 0)+1);
				}else if(change5>=3) {
					map.put(5, change5-3);
					map.put(bills[i], map.getOrDefault(bills[i], 0)+1);
				}else return false;
			}else if(bills[i]==5) {
				map.put(bills[i], map.getOrDefault(bills[i], 0)+1);				
			}
			
			System.out.println(map);
		}		
		return true;
    }
	
	public static boolean lemonadeChange(int[] bills) {
        int fiveCnt = 0, tenCnt = 0;
        
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCnt++;
            } else if (bills[i] == 10) {
                tenCnt++;
                fiveCnt--;
            } else {
                if (tenCnt > 0) {
                    tenCnt--; // if have 10, use 10 first, as 5 is more flexble.
                } else {
                    fiveCnt -= 2; // use five to pay 10 change.
                }

                fiveCnt--; // use to pay the rest 5 change.
            }

            if (fiveCnt < 0) return false;
        }
        return true;
    }
	
}
