class Venue {
    int venueID;
    String venueName;
    String venueAddress;
    int venueCapacity;
    boolean isAvailable;

    public Venue(int venueID, String venueName, String venueAddress, int venueCapacity, boolean isAvailable) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueAddress = venueAddress;
        this.venueCapacity = venueCapacity;
        this.isAvailable = isAvailable;
    }
}