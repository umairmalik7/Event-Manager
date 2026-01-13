
class Ticket{
    private int TicketID;
    private Event event;
    private Participant participant;

    public Ticket(int ticketID, Event event, Participant participant){
        this.TicketID = ticketID;
        this.event = event;
        this.participant = participant;
    }

    public String toString(){
        return  "Ticket_ID:" + this.TicketID + event.display() + participant;
    }
}