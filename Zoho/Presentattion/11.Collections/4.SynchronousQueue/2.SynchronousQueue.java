import java.util.concurrent.*;

public class ArrayBlockingQueueExample{

	public static void main(String[] args) throws InterruptedException{
	
		SynchronousQueue<Integer> obj1 = new SynchronousQueue<>();	
		
		
		new Thread(()->{
			try{
				for(int i=1;i<=10;i++){
					obj1.put(i);
					System.out.println("put()"+i);
					//Thread.sleep(2000);
				}
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
			
		}).start();


		new Thread(()->{
			try{
				for(int i=1;i<=5;i++){
					System.out.println("take()"+obj1.take());
					//Thread.sleep(2000);
				}
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
			
		}).start();
		

	}
}