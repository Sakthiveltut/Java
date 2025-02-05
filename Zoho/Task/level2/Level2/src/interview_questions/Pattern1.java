package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import java.util.SortedMap;
import java.util.TreeMap;

public class Pattern1 {
	
/*	999999999
	988888888
	987777777
	987666666
	987655555
	987654444
	987654333
	987654322
	987654321
*/

	public static void main(String[] args) {
		int n=9;

		for(int i=0;i<n;i++) {
			int temp = n;
			for(int j=0;j<n;j++) {
				
				if(i<=j) {
					temp=n-i;
				}else {
					temp=n-j;
				}
				
				System.out.print(temp);
			}
			System.out.println();
		}
		
	}
	
}
    


