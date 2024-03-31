public class Main {
    public static void main(String[] args) {
        // Create instances of Runnable implementations
        Runnable task1 = new MyTask("Task 1");
        Runnable task2 = new MyTask("Task 2");

        // Create Thread objects and pass the Runnable instances
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Execute the threads
        //thread1.start();
        //thread2.start();
        
        // Alternatively, you can directly execute the run() method
        // of the Runnable instances without starting threads
         task1.run();
         task2.run();
    }

    // Implementation of the Runnable interface
    static class MyTask implements Runnable {
        private final String taskName;

        public MyTask(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(taskName + " - Counter: " + i);
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
