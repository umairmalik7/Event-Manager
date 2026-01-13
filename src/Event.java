import java.time.LocalDateTime;

class Event{
    private String eventName;
    private LocalDateTime eventDate;
    private String location;
    private Organizer organizer;


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

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }


    public Event(String eventName, LocalDateTime eventDate, String location, Organizer organizer){
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.organizer = organizer;
    }
    public String toString(){
        return  "\n--- Event Details ---" + "\nName: " +  this.eventName +"\nDate: " + this.eventDate + "\nLocation:" + this.location  + this.organizer;
    }
    public String display(){
        return  "\n--- Event Details ---" + "\nName: " + this.eventName + "\nDate: " + this.eventDate + "\nLocation: " + this.location;
    }

}