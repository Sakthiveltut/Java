import java.util.concurrent.*;

public class ArrayBlockingQueueExample{

	public static void main(String[] args) throws InterruptedException{
	
		ArrayBlockingQueue<Integer> obj1 = new ArrayBlockingQueue<>(5);	
		
		
		new Thread(()->{
			try{
				for(int i=1;i<=10;i++){
					obj1.put(i);
					System.out.println("put()"+i);
				}
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
			
		}).start();


		/*new Thread(()->{
			try{
				for(int i=1;i<=10;i++){
					System.out.println("take()"+obj1.take());
				}
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
			
		}).start();	*/
		

	}
}