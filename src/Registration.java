
class Registration{
    private int RegistrationID;
    private Event event;
    private Participant  participant;
    private Ticket ticket;
    private Payment payment;

    public Registration(int RegistrationID, Event event, Participant participant,  Ticket ticket, Payment payment) {
        this.RegistrationID = RegistrationID;
        this.event = event;
        this.participant = participant;
        this.ticket = ticket;
        this.payment = payment;
    }

    public String toString(){
        return  event.display() + " " + participant;
    }
}