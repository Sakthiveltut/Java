public class MethodOverloading{

    public void display(int a, int b) {
        System.out.println(a+" "+b+" int,int");
    }

    public void display(int a, int b, int c) {
        System.out.println(a+" "+b+" "+c+" "+"int,int,int");
    }

    public void display(double a, double b) {
        System.out.println(a+" "+b+" double,double");
    }

    public void display(String a, String b) {
        System.out.println(a+" "+b+" String,String");
    }

    public void display(int a, float b) {
	System.out.println(a+" "+b+" int,float");
    }

    public void display(float a,int b) {
	System.out.println(a+" "+b+" float,int");
    }

    public void display(float a,float b) {
	System.out.println(a+" "+b+" float,float");
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

       obj.display(5, 10);
       obj.display(3.5, 2.5);
       obj.display("Hello", " Java");
       obj.display(7, 8, 9);
       obj.display(7.0, 8);
       obj.display(7, 8.0);
    }
}
