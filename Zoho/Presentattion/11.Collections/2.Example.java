import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(5); // Queue capacity is 5

        // Booking tickets
        bookingSystem.bookTicket("Movie A", "John Doe");
        bookingSystem.bookTicket("Movie B", "Alice Smith");
	bookingSystem.bookTicket("Movie A", "John Doe");
        bookingSystem.bookTicket("Movie B", "Alice Smith");
	bookingSystem.bookTicket("Movie A", "John Doe");
        bookingSystem.bookTicket("Movie B", "Alice Smith");

        // Cancelling tickets
        //bookingSystem.cancelTicket();
        //bookingSystem.cancelTicket();
    }
}

class Ticket {
    private String movieName;
    private String personName;
    private static int id;

    public Ticket(String movieName, String personName) {
        this.movieName = movieName;
        this.personName = personName;
        this.id = ++id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getPersonName() {
        return personName;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Movie: " + movieName + ", Person: " + personName + ", ID: " + id);
    }
}

class TicketBookingSystem {
    private ArrayBlockingQueue<Ticket> ticketQueue;

    public TicketBookingSystem(int capacity) {
        ticketQueue = new ArrayBlockingQueue<>(capacity);
    }

    public void bookTicket(String movieName, String personName) {
        Ticket ticket = new Ticket(movieName, personName);
        try {
            ticketQueue.put(ticket);
            System.out.println("Ticket booked: ");
            ticket.display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancelTicket() {
        try {
            Ticket cancelledTicket = ticketQueue.take();
            System.out.println("Cancelled ticket: ");
            cancelledTicket.display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

