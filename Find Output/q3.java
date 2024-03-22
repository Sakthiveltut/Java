public class VarArgs {

	public static void main(String[] args) {

	VarArgs v = new VarArgs();

	//v.check_args();

	v.check_args(10);

	//v.check_args(10,20,30);

	}

	public void check_args(int... a){

		for(int i=0; i<a.length;i++)

		System.out.println(a[i]);
	}
	public void check_args(int a){

		System.out.println("From method");
	}
}
