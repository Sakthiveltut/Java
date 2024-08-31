package com.leetcode;

import java.util.Stack;

public class Q394_Decode_String {

	public static void main(String[] args) {
		String s = "a1[b12[2[ca]]]uk";
		System.out.println(decodeString(s));
	}
	
    /*public static String decodeString(String s){
    	s = s.replace("[", "").replace("]", "");
    	for(int i=s.length()-1;i>=0;i--) {
    		if(Character.isDigit(s.charAt(i))) {
    			s = decodeProcess(i,s);
    		}
    	}
    	return s;
    }
    
    private static String decodeProcess(int position, String data) {
    	int value = Integer.parseInt(data.charAt(position)+"");
    	StringBuilder stringBuilder = new StringBuilder();
    	stringBuilder.append(data.substring(0, position));
    	String repeat = data.substring(position+1), result="";
    	for(int i=1;i<=value;i++) {
    		result+=repeat;
    	}
    	stringBuilder.append(result);
    	
    	return stringBuilder.toString();
    }*/
	
    /*public static String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }*/
	
	
    public static String decodeString(String s) {
    	
    	Stack<Integer> numberStack = new Stack<>();
    	Stack<StringBuilder> stringData = new Stack<>();
    	StringBuilder stringBuilder = new StringBuilder();
    	int number=0;
    	
    	for(char c : s.toCharArray()) {
    		if(Character.isDigit(c)) {
    			number = number*10+(c-'0');
    		}else if(c=='[') {
    			numberStack.push(number);
    			number = 0;
    			stringData.push(stringBuilder);
    			stringBuilder = new StringBuilder();
    		}else if(c==']') {
    			int currentNumber = numberStack.pop();
    			StringBuilder temp = stringBuilder;
    			stringBuilder = stringData.pop();
    			while(currentNumber-- > 0) {
    				stringBuilder.append(temp);
    			}
    		}else {
    			stringBuilder.append(c);
    		}
    	}
    	
    	return stringBuilder.toString();
    }
	
	/*public static String decodeString(String s) {
		int[] i = {0}; 
        return decode(s, i);
    }
    
    public static String decode(String s, int[] i){
        StringBuilder sb = new StringBuilder();
        int num = 0;
        
        while(i[0] < s.length()){
            char ch = s.charAt(i[0]);
            i[0]++; 
            
            if(Character.isDigit(ch)){
                num = num * 10+ (ch -'0'); 
            }
            else if(ch == '['){
                String innerStr = decode(s, i); 
                while(num != 0){ 
                    sb.append(innerStr); 
                    num--; 
                }
            }
            else if(ch == ']'){
                break;  
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }*/
    
}
