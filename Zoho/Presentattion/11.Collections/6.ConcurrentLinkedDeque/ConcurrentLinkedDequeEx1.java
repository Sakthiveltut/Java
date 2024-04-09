import java.util.concurrent.*;

public class ConcurrentLinkedDequeEx1{

	public static void main(String[] args)throws InterruptedException{
		
		ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
		
		new Thread(()->{
			for(int i=0;i<10;i++){
				deque.addFirst(i);
				System.out.println("addFirst "+i);
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<10;i++){
				deque.addLast(i);
				System.out.println("addLast "+i);
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<10;i++){
				deque.removeFirst();
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<10;i++){
				deque.removeLast();
			}
		}).start();	
	}
}

