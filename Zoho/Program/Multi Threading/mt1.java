public class mt1{

	public static void main(String[] args) throws InterruptedException{
	
	//Runable obj1 = new A();
	A obj1 = new A();
	Thread t1 = new Thread(obj1);
	
	B obj2 = new B();
	Thread t2 = new Thread(obj2);
	
	//t1.setPriority(Thread.MAX_PRIORITY);
	//t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	
	t2.start();

	System.out.println(t1.isAlive());

	//t1.join();
	t2.join();

	System.out.println("class mt");
	}
}

class A extends Thread implements Runnable{

	public void run(){

		for(int i=0;i<10;i++){
		
			System.out.println("Class A"+i);
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}	
}

class B extends Thread{

	public void run(){

		for(int i=0;i<10;i++){
		
			System.out.println("Class B"+i);

			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}	
}

