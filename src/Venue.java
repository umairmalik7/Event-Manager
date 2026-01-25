class Venue {
    int venueID;
    String venueName;
    String venueAddress;
    int venueCapacity;

    public Venue(int venueID, String venueName, String venueAddress, int venueCapacity) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueAddress = venueAddress;
        this.venueCapacity = venueCapacity;
    }

    public String toString(){
        return  "Venue_ID:" + this.venueID + "\nVenue_Name:" + this.venueName + "\nVenue_Address:" + this.venueAddress + "\nVenue_Capacity:" + this.venueCapacity;
    }
    public String display(){
        return " | Venue: " + this.venueName + " | Address: " + this.venueAddress ;
    }
}