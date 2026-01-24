import java.time.LocalDateTime;

class Event{
    private String eventName;
    private LocalDateTime eventDate;
    private Venue eventLocation;
//    private Organizer organizer;
    private Category category;
    private int no_of_tickets;
    private int ticketPrice;




    public Event(String eventName, LocalDateTime eventDate, Venue location,  Category category, int no_of_tickets, int ticketPrice) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = location;
//        this.organizer = organizer;
        this.category = category;
        this.no_of_tickets = no_of_tickets;
        this.ticketPrice = ticketPrice;
    }
//    public String toString(){
//        return  "\n--- Event Details ---" + "\nName: " +  this.eventName +"\nDate: " + this.eventDate + "\nLocation:" + this.eventLocation + this.organizer;
//    }
    public String display(){
        return  "\n--- Event Details ---" + "\nName: " + this.eventName + "\nDate: " + this.eventDate + "\nLocation: " + this.eventLocation + "\nCategory" + this.category + "\n NO of tickets" + this.no_of_tickets + "\nTicket" + this.ticketPrice;
    }

}