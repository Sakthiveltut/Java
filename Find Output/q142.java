class ArrayDemo1 { 
public static void main(String[] args) 
    { 
        int arr1[] = new int[0]; 
        int arr2[] = new int[-1]; 
        //run time exception
  
        System.out.print(arr1.length + " : " + arr2.length); 
    } 
} 