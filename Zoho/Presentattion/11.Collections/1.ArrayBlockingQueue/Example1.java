import java.util.concurrent.ArrayBlockingQueue;

class MovieTicket {
    private String movieName;
    private int numberOfTickets;

    public MovieTicket(String movieName, int numberOfTickets) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}

class TicketBookingSystem {
    private ArrayBlockingQueue<MovieTicket> ticketQueue;

    public TicketBookingSystem(int capacity) {
        ticketQueue = new ArrayBlockingQueue<>(capacity);
    }

    public void bookTicket(String movieName, int numberOfTickets) {
        MovieTicket ticket = new MovieTicket(movieName, numberOfTickets);
        try {
            ticketQueue.put(ticket);
            System.out.println(numberOfTickets + " ticket(s) booked for " + movieName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancelTicket() {
        try {
            MovieTicket cancelledTicket = ticketQueue.take();
            System.out.println("Cancelled booking for " + cancelledTicket.getMovieName() +
                               " (" + cancelledTicket.getNumberOfTickets() + " tickets)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(5); // Queue capacity is 5

        // Booking tickets
        bookingSystem.bookTicket("Movie A", 2);
        bookingSystem.bookTicket("Movie B", 3);

        // Cancelling tickets
        bookingSystem.cancelTicket();
        bookingSystem.cancelTicket();
    }
}
