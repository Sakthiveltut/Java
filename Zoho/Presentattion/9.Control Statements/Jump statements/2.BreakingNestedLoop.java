public class  BreakingNestedLoop{
	public static void main(String args[]) {
		String[][][] Depts = {
			{{"Mosesh","21","CSE"},{"Rahul","21","CSE"},{"Madhan","21","CSE"}},
			{{"Sakthi","21","ECE"},{"Joesh","21","ECE"},{"Francis","21","ECE"}},
			{{"Murali","21","EEE"},{"Karuppasamy","21","EEE"},{"Praveen","21","EEE"}},
			};
		a:
        	for (String[][] Dept : Depts)
		{
			b:
			for(String[] students:Dept)
			{
				c:
				for(String student:students)
				{
					System.out.print(student+" ");
					break c;
				}
				System.out.println();
			}
			System.out.println();
        	}
    	}
}