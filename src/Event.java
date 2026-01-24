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
    public String toString(){
        return  "\n--- Event Details ---" + "\nName: " +  this.eventName +"\nDate: " + this.eventDate + "\n" + this.eventLocation.toString() + this.organizer + "\n" + this.category.toString() + "\nTotal_Tickets" + this.no_of_tickets + "\nTicket_Price" + this.ticketPrice;
    }
    public String display(){
        return  "\n--- Event Details ---" + "\nName: " + this.eventName + "\nDate: " + this.eventDate + "\n--- Venue Details ---\n" + this.eventLocation.toString() + "\n --- Category details ---\n" + this.category.toString() + "\nTotal_Tickets: " + this.no_of_tickets + "\nTicket_Price: " + this.ticketPrice;
    }

}