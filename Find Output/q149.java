class Test { 
public
    static void main(String[] args) 
    { 
        int i = 0, j = 9; 
        do { 
            i++; 
            System.out.println(j+" "+i);
            if (j-- < i++) { 
                break; 
            } 
        } while (i < 5); 
        System.out.println(i + "" + j); 
    } 
} 