// TicketManager.java
import java.util.ArrayList;

public class TicketManager {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private int nextTicketId = 1;

    public Ticket createTicket(Event event, Participant participant) {
        Ticket ticket = new Ticket(nextTicketId, event, participant);
        nextTicketId++;
        tickets.add(ticket);
        return ticket;
    }
}