class demo8 { 
    public static void main(String args[]) 
    { 
        String str = "Java Programming"; 
        String str1 = "Programminggggg"; 
  
        if (str.regionMatches(5, str1, 0, 11)) 
            System.out.println("Same"); 
    } 
} 