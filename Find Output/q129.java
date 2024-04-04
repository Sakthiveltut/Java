class demo5 { 
    public static void main(String args[]) 
    { 
        String str = "Java Programming"; 
        char arr[] = new char[10]; 
        str.getChars(0, 6, arr, 5); 
        System.out.println(arr); 
    } 
} 