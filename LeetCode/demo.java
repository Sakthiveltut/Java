package LeetCode;

import java.util.*;

public class demo1 {

    public static void main(String[] args) {

	String haystack = "sadbutsad", needle = "sad";
		
	char haystackChar[] = haystack.toCharArray();
        char needleChar[] = needle.toCharArray();
	
	/*for(char c: needleChar){
		System.out.println(c);
	}*/
        


        /*int count = 0;
        for(int i=0;i<haystackChar.length;i++){
		System.out.println(haystackChar[i]+" "+ needleChar[count]);
            while(haystackChar[i] == needleChar[count]){
                ++count;
		System.out.println("while "+count);
		break;
            }if(haystackChar[i] != needleChar[count]){
                count = 0;
            }
        }
	System.out.println("final count"+count);*/
	

	

        int count1 = 0, count2 = 0;
	    System.out.println(haystackChar[count1]+" "+ needleChar[count2]);
            while(haystackChar[count1] == needleChar[count2]){
		if(count2<needleChar.length){
			++count1;
			++count2;
		}else{
			return;
		}
		System.out.println("while "+count2);
            }if(haystackChar[count1] != needleChar[count2]){
                count1 = 0;
		++count1;
            }
	System.out.println("final count"+count1);
	
	
    }
}
