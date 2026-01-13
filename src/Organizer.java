class Organizer{
    private String organizer_name;
    private String organizer_email;
    private String organizer_contact_no;

    public Organizer(String organizer_name, String organizer_email, String organizer_contact_no) {
        this.organizer_name = organizer_name;
        this.organizer_email = organizer_email;
        this.organizer_contact_no = organizer_contact_no;
    }
    public String toString(){
        return "\n --- Organizer Details ---" + "\nName: " + this.organizer_name + "\nEmail_ID: " +  this.organizer_email  + "\nContact_no: " + this.organizer_contact_no;
    }

}