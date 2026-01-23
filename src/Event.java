import java.time.LocalDateTime;

class Event{
    private String eventName;
    private LocalDateTime eventDate;
    private Venue eventLocation;
    private Organizer organizer;
    private Category category;


    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public Venue getEventLocation() {
        return eventLocation;
    }
    public void setEventLocation(Venue eventLocation) {
        this.eventLocation = eventLocation;
    }


    public Event(String eventName, LocalDateTime eventDate, Venue location, Organizer organizer,  Category category) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = location;
        this.organizer = organizer;
        this.category = category;
    }
    public String toString(){
        return  "\n--- Event Details ---" + "\nName: " +  this.eventName +"\nDate: " + this.eventDate + "\nLocation:" + this.eventLocation + this.organizer;
    }
    public String display(){
        return  "\n--- Event Details ---" + "\nName: " + this.eventName + "\nDate: " + this.eventDate + "\nLocation: " + this.eventLocation;
    }

}