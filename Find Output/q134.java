public class demo5 { 
    public static void main(String args[]) 
    { 
        String str = "Java Programming"; 
        char arr[] = new char[10]; 
        str.getChars(0, 4, arr, 0); 
        System.out.println(arr); 
        
        int arr1[] = new int[10];
        arr1[0] = 0;
        System.out.println(arr1); 
        
        char arr2[] = new char[10];
        arr2[0] = '6';
        arr2[1] = 97;
        arr2[2] = 10000;
        arr2[3]  = 2000;
        System.out.println(arr2); 
    } 
} 