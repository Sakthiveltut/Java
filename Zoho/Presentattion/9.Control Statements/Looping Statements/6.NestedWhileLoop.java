import java.util.Scanner;

public class NestedWhileLoop {

	public static void main(String args[]) {
    		int n = 10;
    		int i = 1;
    		while (i <= n) {
      			System.out.println(i);
      			i++;
				while(i<=n){
					System.out.println(i);
					break;
				}
   		}
	}
}
