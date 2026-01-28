import java.time.LocalDateTime;

class Event{
    private String eventName;
    private LocalDateTime eventDate;
    private Venue eventLocation;
    private Organizer organizer;
    private Category category;
    private int no_of_tickets;
    private int ticketPrice;




    public Event(String eventName, LocalDateTime eventDate, Venue location,Organizer organizer,  Category category, int no_of_tickets, int ticketPrice) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = location;
        this.organizer = organizer;
        this.category = category;
        this.no_of_tickets = no_of_tickets;
        this.ticketPrice = ticketPrice;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }
    public int getNo_of_tickets(){
        return no_of_tickets;
    }
    public String toString(){
        return  "\n--- Event Details ---" + "\nName: " +  this.eventName +"\nDate: " + this.eventDate + "\n" + this.eventLocation.toString() + this.organizer + "\n" + this.category.toString() + "\nTotal_Tickets" + this.no_of_tickets + "\nTicket_Price" + this.ticketPrice;
    }
    public String display(){
        return   this.eventName + " | Date: " + this.eventDate + this.eventLocation.display() + " | Ticket_Price: " + this.ticketPrice;
    }

}