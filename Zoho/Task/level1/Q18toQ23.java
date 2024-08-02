public class Q18toQ23{

	public static void main(String[] args){
		int a=5,b=10;
		//System.out.println(++a-b-);	//illegal start of expression
		//System.out.println(a%b++);	//5%10=5
		System.out.println(a*=b+5);	//75
		
		/*
		128	64	32	16	8	4	2	1
		------------------------------
		0	1	0	0	0	1	0	1   
		0   0	0	1	0	0	0	1   //17
		*/
		
		System.out.println(69>>>2);

		a=2;
		System.out.println("a "+(a+=a++ + ++a + -a +a-));	//illegal start of expression
		System.out.println(a+=a++ + ++a + -a +a);	//a=28+28+30+-28+28=86
		int x = 5;
		System.out.println(x=x++*2+3*-x);//5*2+3*-6 -> 10-18
		int y=10;
		int z=(++y*(y++ + 5)); //11*(11+5) -> //176
		System.out.println(z);	
		x= 5;
		int x1 = ++x - x++ + -x;  //6-6+-7 -> -7
		System.out.println(x1);	
		
	}
}

