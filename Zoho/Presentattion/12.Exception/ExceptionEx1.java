import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		
		/*
		Checked Exceptions (Compiletime Exceptions):
			1.Must be handled using try-catch.
			
			IOException, FileNotFoundException, SQLException, ParseException
		
		
		
		Unchecked Exceptions (Runtime Exceptions):
			1.Optional handling (try-catch not required).
			NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException, NumberFormatException
		
			
		*/
		List<String> list = new ArrayList<>();
		try{
			//1.ArithmeticException
			//System.out.println(10/0);
			
			//2.NullPointerException
			/*String s=null;
			System.out.println(s.length());*/
			
			//3.NumberFormatException
			/*String name="mosesh";
			int n= Integer.parseInt(name);*/   
			
			
			list.add("Rahul");
			list.add("Sakthi");
			list.add("Mosesh");
			
			//4.ConcurrentModificationException
			/*for(String name:list){
				list.remove(name);
				//System.out.println(name);
			}*/
			

			//5.IllegalStateException
			/*Iterator i = list.iterator();
			while(i.hasNext()){
				i.remove();
			}*/
			
			
			//6.IllegalThreadStateException
			/*Thread t1 = new Thread();
			t1.start();
			t1.start();*/
			
			
			//7.ClassCastException
			/*Object name = "rahul";
			Integer n = (Integer)name;*/
			
			
			//8.ArrayStoreException
			/*Object[] arr = new Integer[5];
			arr[0]=10;
			arr[1]="sakthi";
			System.out.println(Arrays.toString(arr));*/
			
			
			//9.UnsupportedOperationException
			/*String name[] = {"rahul", "mosesh"};
			List<String> list1 = Arrays.asList(name);
			list1.add("Sakthi");
			list1.remove("rahul");*/
			
			
			
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println(e);
		}finally{
			System.out.println(list);
		}
		
	}
}

