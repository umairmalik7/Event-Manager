
class Participant{
    private String participant_name;
    private String participant_email;
    private String contact_no;

    public Participant(String participant_name,String participant_email,String contact_no){
        this.participant_name=participant_name;
        this.participant_email=participant_email;
        this.contact_no=contact_no;
    }
    public String toString(){
        return "\n--- Participant Detials ---\n" + "Name: " + this.participant_name + "\nEmail_ID: " + this.participant_email + "\nContact_no: " + this.contact_no;
    }
}