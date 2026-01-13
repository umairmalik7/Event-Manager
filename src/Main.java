import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        LocalDateTime seminartime = LocalDateTime.of(2026,01,12,14,20);
//
        Organizer o1 = new Organizer("Umair","m.umair4983@gmail.com","03168564949");
        Event e1 = new Event("IEEE Seminar", seminartime, "university", o1);
        Participant p1 = new Participant("Alex","Alex32@gmail.com", "03198762324");
        Registration r1 = new Registration(e1,p1);
        Ticket t1  = new Ticket(01,e1,p1);
        System.out.println(t1);





    }
}