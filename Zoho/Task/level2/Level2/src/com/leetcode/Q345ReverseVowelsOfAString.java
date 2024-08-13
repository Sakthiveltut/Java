package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q345ReverseVowelsOfAString {

	public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));
	}

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        ArrayList<Integer> position = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        for(int i=0;i<ch.length ;i++) {
        	if(vowels.contains(ch[i]+"")) {
        		position.add(i);
        	}
        }
        System.out.println(position);
        for(int i=0,j=position.size()-1;i<position.size() && j>=0;i++,j--) {
        	if(i<j) {
        		char temp = ch[position.get(j)];
        		ch[position.get(j)] = ch[position.get(i)];
        		ch[position.get(i)] = temp;
        	}else break;
        }
        return new String(ch);
    }
    
    public String reverseVowels1(String s) {
        char[] list=s.toCharArray();
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i=0, j=list.length-1; i<j; ) {
            if (!set.contains(list[i])) {
                i++;
                continue;
            }
            if (!set.contains(list[j])) {
                j--;
                continue;
            }
            char temp=list[i];
            list[i]=list[j];
            list[j]=temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }
    
    public String reverseVowels3(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(i<j){
           // System.out.println(sb);
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(set.contains(a) ){
                if(set.contains(b)){
                    sb.replace(i,i+1,""+b);
                    sb.replace(j,j+1,""+a);
                    i++;
                } 
                j--;
            }
            else if(set.contains(b)){
                i++;
            }
            else{
                i++;
                j--;
            }
            
        }
        return sb.toString();
    }
}
