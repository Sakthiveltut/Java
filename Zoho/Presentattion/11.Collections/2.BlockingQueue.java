import java.util.concurrent.*;

public class ArrayBlockingQueueExample{

	public static void main(String[] args) throws InterruptedException{
	
		//ArrayBlockingQueue<Integer> obj1 = new ArrayBlockingQueue<>(5);	//bounded
		//LinkedBlockingQueue<Integer> obj1 = new LinkedBlockingQueue<>(5);	//both
		//PriorityBlockingQueue<Integer> obj1 = new PriorityBlockingQueue<>();	//unbounded
		SynchronousQueue<Integer> obj1 = new SynchronousQueue<>();	//unbounded

		//ConcurrentLinkedQueue<Integer> obj1 = new ConcurrentLinkedQueue<>();	//unbounded
		
		new Thread(()->{
			try{
				for(int i=1;i<=30;i++){
					obj1.put(i);
					//obj1.add(i);
					System.out.println("put "+i);
					//System.out.println(obj1);
				}
			}catch(Exception e){
				e.printStackTrace();	
			}
			
		}).start();

		//System.out.println(obj1);

		new Thread(()->{
			try{
				for(int i=1;i<=10;i++){
					//System.out.println(obj1);
					System.out.println("take "+obj1.take());
					//System.out.println("poll "+obj1.poll());
				}
			}catch(Exception e){
				e.printStackTrace();	
			}
			
		}).start();

	}
}
