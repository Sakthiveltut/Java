import java.util.concurrent.*;

public class ArrayBlockingQueueExample{

	public static void main(String[] args) throws InterruptedException{
	
		LinkedBlockingQueue<Integer> obj1 = new LinkedBlockingQueue<>();	
		
		
		new Thread(()->{
			try{
				for(int i=1;i<=10;i++){
					obj1.put(i);
					//System.out.println("put "+i);
				}
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
			
		}).start();


		new Thread(()->{
			try{
				for(int i=1;i<=5;i++){
					System.out.println("take "+obj1.take());
				}
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
			
		}).start();
	}
}