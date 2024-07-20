interface Printable{
    public int value1 = 10;   
    public void print();  
    	default public void method1(){
		System.out.println("Method1");
	}
	static void method2(){
		System.out.println("Method3");
	}
}  
interface Showable{  
    void print();
    default int add(int a,int b){
        return a+b;
    }
    default public int sub(int a,int b){
    	return a-b;
    }
}  
class Interface1 implements Printable, Showable{  
    @Override
    public void print(){
        System.out.println("Hello");
    }  
	@Override
	public int sub(int a, int b){
		return a*b;
	}

    public static void main(String args[]){  

        Interface1 obj = new Interface1();  
		System.out.println(obj.sub(10,10));
    }  
}  