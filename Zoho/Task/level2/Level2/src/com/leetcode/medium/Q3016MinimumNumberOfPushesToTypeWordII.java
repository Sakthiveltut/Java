package com.leetcode.medium;

import java.util.Arrays;

public class Q3016MinimumNumberOfPushesToTypeWordII {

	public static void main(String[] args) {
		//System.out.println(minimumPushes("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(minimumPushes("abcdefghiiiii"));
	}
	
	/*public static int minimumPushes(String word) {
		HashMap<Character, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(char ch:word.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int value:map.values()) {
			list.add(value);
		}
		
		Collections.sort(list, Comparator.reverseOrder());
		int result = 0;
		if(map.size()<=26) {
			for(int i=0;i<list.size();i++) {
				if(i<8) {
					result+=list.get(i);
				}else if(i<16) {
					result+=list.get(i)*2;
				}else if(i<24) {
					result+=list.get(i)*3;
				}else if(i<26) {
					result+=list.get(i)*4;
				}
			}
		}
		
		return result;
    }*/
	
	
	  public static int minimumPushes(String word) {
		    int ans = 0;
		    int[] count = new int[26];

		    for (final char c : word.toCharArray())
		      ++count[c - 'a'];

		    System.out.println(Arrays.toString(count));
		    Arrays.sort(count);
		    System.out.println(Arrays.toString(count));

		    for (int i = 0; i < 26; ++i) {
			      //System.out.println(count[26 - i - 1]);
			      ans += count[26 - i - 1] * (i / 8 + 1);
			      System.out.println(ans);
			      System.out.println(count[26 - i - 1] +" "+(i / 8 + 1));
		    }

		    return ans;
	  }
	
}
