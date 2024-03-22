public class NestedForEach {
	
	public static void main(String args[]) {
    		
		String[][] students = {{"Rahul","21","CSE"},{"Mosesh","21","CSE"},{"Madan","21","CSE"}};
				
		for(String[] student: students){
			
			for(String s:student){
				
				System.out.print(s+" ");
			}	
		System.out.println();
		}
  	}
}
