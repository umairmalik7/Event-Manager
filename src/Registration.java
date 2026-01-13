
class Registration{
    private Event event;
    private Participant  participant;

    public Registration(Event event, Participant participant){
        this.event = event;
        this.participant = participant;
    }

    public String toString(){
        return  event.display() + " " + participant;
    }
}