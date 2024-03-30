package LeetCode;

import java.util.*;

public class demo1 {

    public static void main(String[] args) {

	String haystack = "leetcode", needle = "leeto";
		
	char haystackChar[] = haystack.toCharArray();
        char needleChar[] = needle.toCharArray();
        
        int count1 = 0, count2 = 0;
	    // System.out.println(haystackChar[count1]+" "+ needleChar[count2]);
        
        
	 a:
       for(int i=0;i<haystackChar.length;i++){ 
                while(haystackChar[count1] == needleChar[count2]){

                    if(count2 == needleChar.length-1){
                        break a;
                    }
                    if(count2<needleChar.length){
                count1++;
                count2++;
                    }
                }
            if(count1 == haystackChar.length-1){
                        if(count2 < needleChar.length-1){
                            return -1;
                    //System.out.println("return -1");
                        }
                }
            if(haystackChar[count1] != needleChar[count2]){
                        count2 = 0;
                ++count1;
                }
	    }
	System.out.println("final count"+(count1-count2));
        return (count1-count2);
    }
    }
}