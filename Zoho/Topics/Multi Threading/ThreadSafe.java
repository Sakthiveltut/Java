public class ThreadSafe {
    public static void main(String[] args) {
        
        Runnable task1 = () -> {
            	Singleton singleton = Singleton.getInstance();

	   	System.out.println(singleton.hashCode());
        };

        Thread thread1 = new Thread(task1); 
        Thread thread2 = new Thread(task1);
		
		System.out.println(Singleton.class);

        thread1.start();
        thread2.start();
    }
}


class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
		synchronized(Singleton.class){
                	if (instance == null) {
                    		instance = new Singleton();
                	}
		}
        return instance;
    }
}

