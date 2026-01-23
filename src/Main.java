import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        LocalDateTime seminartime = LocalDateTime.of(2026,01,12,14,20);
//
        Organizer o1 = new Organizer("Umair","m.umair4983@gmail.com","03168564949");
        Venue v1 = new Venue(01,"Main audotorium ","UET", 3000,true);
        Category c1 = new Category(01,"Workshop");
        Event e1 = new Event("IEEE Seminar", seminartime, v1, o1,c1);
        Participant p1 = new Participant("Alex","Alex32@gmail.com", "03198762324");
        Payment py1 = new Payment(01,1000,"Cash","done", "01-23-25");
        Ticket t1  = new Ticket(01,e1,p1);
        Registration r1 = new Registration(01,e1,p1,t1,py1);

        System.out.println(t1);





    }
}