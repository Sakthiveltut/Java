public class Question4{

	public static void main(String[] args){
		
		System.out.println("AND: "+(0&0)+" "+(0&1)+" "+(1&0)+" "+(1&1));
		System.out.println("OR: "+(0|0)+" "+(0|1)+" "+(1|0)+" "+(1|1));
		System.out.println("XOR: "+(0^0)+" "+(0^1)+" "+(1^0)+" "+(1^1));
		
		/*10 - 1010
		10 - 1010  	&
		---------
		10 - 1010 
		---------
		
		10 - 1010
		8 -  1000   |
		---------
		10  - 1010
		---------
		
		10 - 1010
		8 -  1000   ^
		---------
		2  - 0010
		---------
		
		10 - 1010	~
				1
		---------
		2  - 0101
		---------

		Signed Right Shift Operator (>>)            b=a>>n  ->  b=a/(2 power n)
		Signed Left Shift Operator (<<)             b=a<<n  ->  b=a*(2 power n)

		*/
		System.out.println(10&10);  
		System.out.println(10|10);
		System.out.println(~100);    //-(n+1)= -21    2's Complement
		System.out.println(10<<3);  //10*8 = 80  
		System.out.println(10>>3);  //10/8 = 1     
		
		
		System.out.println(10>>>2);		 //1010 -> 0010
		System.out.println(16>>>2);		 //10000 -> 0100 

		System.out.println(10>>2);  
		System.out.println(16>>2);
		
		System.out.println(-10>>2);  
		System.out.println(-10>>>2);
	}
}

