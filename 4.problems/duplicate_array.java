public class duplicate_array {
    public static void main(String args[]) {
        //Write a program to print the duplicate element in an array
        int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++)
            {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + a[j]);
                }
            }
        }
 
    }
}