package com.basic;

public class StringCombination {    
    public static String swapString(String a, int i, int j) {  
    	if(i!=j) {
    		//System.out.println(i+" "+j);
        char[] b =a.toCharArray();    
        char ch;    
        ch = b[i];    
        b[i] = b[j];    
        b[j] = ch;    
        return String.valueOf(b);    
    	}
    	return a;
    }    
        
    public static void main(String[] args)    
    {    
        String str = "abc";    
        int len = str.length();    
        generatePermutation(str, 0, len);    
    }    
        
    public static void generatePermutation(String str, int start, int end)    
    {    
        if (start == end-1)    
            System.out.println(str);    
        else    
        {    
            for (int i = start; i < end; i++)    
            {    
                str = swapString(str,start,i);   
                //System.out.println(start+" "+i);
                generatePermutation(str,start+1,end);    
                str = swapString(str,start,i);   
                //System.out.println(start+" "+i);
            }    
        }    
    }    
}
