public class Q27 {
	public static void main(String[] args) {
	int num1 = 10, num2 = 20, temp;
	
	temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println(num1+" "+num2);
	
	num1 = num1+num2;
	num2 = num1-num2;
	num1 = num1-num2;
	System.out.println(num1+" "+num2);
	
	num1 = num1^num2;
	num2 = num1^num2;
	num1 = num1^num2;
	System.out.println(num1+" "+num2);
	}
}