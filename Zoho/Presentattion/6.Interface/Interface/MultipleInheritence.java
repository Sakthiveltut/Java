class C extends A, B{  
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();  
 }  
}  

class A{  
	void msg(){System.out.println("A");}  
}  
class B{  
	void msg(){System.out.println("B");}  
}  