import java.util.concurrent.*;

// Main class to demonstrate the Ticket Reservation System
public class Main {
    public static void main(String[] args) {
        // ArrayBlockingQueue example
        BlockingQueue<Ticket> arrayBlockingQueue = new ArrayBlockingQueue<>(10); // Max capacity of 10
        TicketReservationSystem arrayTicketSystem = new TicketReservationSystem(arrayBlockingQueue);

        // LinkedBlockingQueue example
        BlockingQueue<Ticket> linkedBlockingQueue = new LinkedBlockingQueue<>();
        TicketReservationSystem linkedTicketSystem = new TicketReservationSystem(linkedBlockingQueue);

        // PriorityBlockingQueue example (with custom comparator for demonstration)
        BlockingQueue<Ticket> priorityBlockingQueue = new PriorityBlockingQueue<>(10, (t1, t2) ->
                t1.getCustomerName().compareTo(t2.getCustomerName()));
        TicketReservationSystem priorityTicketSystem = new TicketReservationSystem(priorityBlockingQueue);

        // SynchronousQueue example
        BlockingQueue<Ticket> synchronousQueue = new SynchronousQueue<>();
        TicketReservationSystem synchronousTicketSystem = new TicketReservationSystem(synchronousQueue);

        // Simulating ticket reservations
        try {
            arrayTicketSystem.bookTicket("Alice");
            arrayTicketSystem.bookTicket("Bob");

            linkedTicketSystem.bookTicket("Charlie");
            linkedTicketSystem.bookTicket("David");

            priorityTicketSystem.bookTicket("Eve");
            priorityTicketSystem.bookTicket("Alice");

            synchronousTicketSystem.bookTicket("Frank");

            arrayTicketSystem.cancelTicket();
            linkedTicketSystem.cancelTicket();
            priorityTicketSystem.cancelTicket();
            synchronousTicketSystem.cancelTicket();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Ticket class representing a single ticket reservation
class Ticket {
    private final int ticketNumber;
    private final String customerName;

    public Ticket(int ticketNumber, String customerName) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}

// TicketReservationSystem class managing ticket reservations
class TicketReservationSystem {
    private final BlockingQueue<Ticket> ticketQueue;

    public TicketReservationSystem(BlockingQueue<Ticket> ticketQueue) {
        this.ticketQueue = ticketQueue;
    }

    public void bookTicket(String customerName) throws InterruptedException {
        // Generate a ticket number (for simplicity, incrementing)
        int ticketNumber = ticketQueue.size() + 1;
        Ticket ticket = new Ticket(ticketNumber, customerName);
        ticketQueue.put(ticket); // Add ticket to the queue
        System.out.println("Ticket booked: " + ticketNumber + " - Customer: " + customerName);
    }

    public void cancelTicket() throws InterruptedException {
        Ticket cancelledTicket = ticketQueue.take(); // Remove a ticket from the queue
        System.out.println("Ticket cancelled: " + cancelledTicket.getTicketNumber() +
                           " - Customer: " + cancelledTicket.getCustomerName());
    }
}


