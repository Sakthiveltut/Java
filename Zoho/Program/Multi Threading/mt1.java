public class mt1{

	public static void main(String[] args) throws InterruptedException{
	
	Runnable object1 = new A();
	B object2 = new B();

	Thread t1 = new Thread(object1);
	

	t1.start();
	//object2.setPriority(Thread.MAX_PRIORITY);
	object2.start();

	//System.out.println(object1.isAlive());

	//object1.join();
	object2.join();

	System.out.println("class mt");

	

	}
}


class A implements Runnable{

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

	public synchronized void run(){

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

