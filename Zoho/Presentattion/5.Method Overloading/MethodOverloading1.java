public class MethodOverloading1{

    /*public void display(long a, long b) {
        System.out.println(a+" "+b+" long,long");
    }*/
    /*public void display(int a, int b) {
        System.out.println(a+" "+b+" int,int");
    }*/

    /*public void display(double a, double b) {
        System.out.println(a+" "+b+" double,double");
    }*/
    /*
    public void display(int a, float b) {
	System.out.println(a+" "+b+" int,float");
    }

    public void display(float a,int b) {
	System.out.println(a+" "+b+" float,int");
    }*/

    public void display(float a,float b) {
	System.out.println(a+" "+b+" float,float");
    }

    public static void main(String[] args) {
       MethodOverloading1 obj = new MethodOverloading1();
	obj.display((byte)100, (byte)100);
	obj.display(100, 100);
	obj.display(100l, 100l);
    }
}
