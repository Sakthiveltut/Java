import java.util.Scanner;

public class IntVsInteger{

	public static void main(String[] args){
		
		int total1 = 0;
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=10000000;i++){
			total1+=i;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("int: "+(endTime-startTime)+"ms");
		
		Integer total2 = 0;
		startTime = System.currentTimeMillis();
		for(int i=1;i<=10000000;i++){
			total2+=i;
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("Integer: "+(endTime-startTime)+"ms");
	}
}

