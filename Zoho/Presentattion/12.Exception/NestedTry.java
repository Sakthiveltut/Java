public class NestedTry{
	public static void main(String[] args){

		try{
			int arr[] = new int[5];
			//System.out.println(arr[10]);
			//System.out.println(10/0);	

			try{
				String name = null;
				name.length();
			}catch(NullPointerException e){
				System.out.println(e);			
			}finally{
				System.out.println("inner finally");
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}finally{
				System.out.println("outer finally");
		}
	}
}

