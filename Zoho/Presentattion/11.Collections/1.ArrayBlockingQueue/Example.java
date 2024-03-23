import java.util.concurrent.ArrayBlockingQueue;

public class PrintingService {
    private ArrayBlockingQueue<String> documentQueue;

    public PrintingService(int capacity) {
        documentQueue = new ArrayBlockingQueue<>(capacity);
    }

    public void submitDocument(String document) throws InterruptedException {
        documentQueue.put(document); // Add document to the queue
        System.out.println("Document submitted: " + document);
    }

    public void printDocument() throws InterruptedException {
        String document = documentQueue.take(); // Retrieve document from the queue
        System.out.println("Printing document: " + document);
    }

    public static void main(String[] args) {
        PrintingService printingService = new PrintingService(10); // Capacity of 10 documents

        // User thread (producer)
        Thread user = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    String document = "Document " + i;
                    printingService.submitDocument(document);
                    Thread.sleep(500); // Simulate document submission delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Printer thread (consumer)
        Thread printer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    printingService.printDocument();
                    Thread.sleep(1000); // Simulate document printing delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        user.start();
        printer.start();
    }
}
