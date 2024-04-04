class Test2 { 
public
    static void main(String[] args) 
    { 
        int arr[][] = { { 11, 22 }, { 33, 44, 55 } }; 
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < arr.length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        }
        
        
        
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
    } 
} 