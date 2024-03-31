public class PriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        
        thread1.setPriority(Thread.MAX_PRIORITY);//10

        thread2.setPriority(Thread.MIN_PRIORITY);//1

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
    }
}
