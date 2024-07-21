package com.cheat_sheet;

public class Q26 {

	public static void main(String[] args) {
		String s = "3[b2[ca]]";
		System.out.println(decodedString(s));
	}
	
    static String decodedString(String s){
    	s = s.replace("[", "").replace("]", "");
    	for(int i=s.length()-1;i>=0;i--) {
    		if(Character.isDigit(s.charAt(i))) {
    			s = decodeProcess(i,s);
    			System.out.println(s);
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
    }
}
