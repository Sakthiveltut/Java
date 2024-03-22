public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        
        // Define a callback method implementation
        Callback callback = new Callback() {
            @Override
            public void onComplete() {
                System.out.println("Callback method called.");
            }
        };
        
        // Pass the callback method to the worker
        worker.doWork(callback);
    }
}

interface Callback {
    void onComplete();
}

class Worker {
    void doWork(Callback callback) {
        System.out.println("Doing work...");
        // Simulate some work being done
        try {
            Thread.sleep(2000); // Simulate a delay of 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work done.");
        
        // Invoke the callback method when the work is complete
        callback.onComplete();
    }
}