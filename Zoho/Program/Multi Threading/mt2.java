public class mt2{

	public static void main(String[] args) throws InterruptedException{
	
	/*Runnable object1 = new Runnable(){
	
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

	};*/

	Runnable object1 = () -> {
	

		for(int i=0;i<10;i++){
		
			System.out.println("Class A"+i);
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
	}

	
	};
	B object2 = new B();

	Thread t1 = new Thread(object1);

	t1.setName("object1");

	System.out.println(t1.getName());
	

	t1.start();
	//object2.setPriority(Thread.MAX_PRIORITY);
	object2.start();

	//System.out.println(object1.isAlive());

	//object1.join();
	object2.join();

	System.out.println("class mt");

	
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

