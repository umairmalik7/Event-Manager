import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static Organizer organizer = null;
    static ArrayList<Event> events = new ArrayList<Event>();
    static ArrayList<Participant> participants = new ArrayList<Participant>();
    static Scanner input = new Scanner(System.in);

    public static Organizer registerOrganizer(){
        System.out.println("No Organizer found");
        System.out.println("Please register an organizer!\n");
        System.out.print("Enter Organizer Name: ");
        String organizer_name = input.next();
        System.out.print("Enter Organizer Email ID: ");
        String organizer_email = input.next();
        System.out.print("Enter Organizer ContactNo: ");
        String organizer_contact_no = input.next();
        Organizer o1 = new Organizer(organizer_name, organizer_email, organizer_contact_no);
        return o1;
    }


    public static Venue selectVenue(){
        System.out.println(" --- Enter Venue details for the Event ---");
        System.out.print("Venue ID:");
        int  venue_id = input.nextInt();
        input.nextLine();
        System.out.print("Name: ");
        String venue_name = input.nextLine();
        System.out.print("Address: ");
        String venue_address = input.nextLine();
        System.out.print("Capacity: ");
        int venue_capacity = input.nextInt();
        Venue v1 = new Venue(venue_id, venue_name, venue_address, venue_capacity);
        return  v1;
    }
    public static Category selectCategory(){
        System.out.println(" --- Enter Category details for the category ---");
        System.out.print("Category ID:");
        int category_id = input.nextInt();
        System.out.print("Category Name: ");
        String category_name = input.next();
        Category c = new Category(category_id, category_name);
        return c;
    }
    public static void createEvent(){
        System.out.println("\n --- Enter Event Details ---");
        System.out.print("Event Name: ");
        String event_name = input.nextLine();
        input.nextLine();
        LocalDateTime event_time = LocalDateTime.of(2026,01,29,13,30,00);
        Venue selectedVenue =  Main.selectVenue();
        Category selectedCategory = Main.selectCategory();
        System.out.print("Enter Total No of Tickets: ");
        int  no_of_tickets = input.nextInt();
        System.out.print("Enter ticket price: ");
        int  ticket_price = input.nextInt();
        Event e1 = new  Event(event_name,event_time,selectedVenue,organizer,selectedCategory, no_of_tickets, ticket_price);
        events.add(e1);
    }
    public static void show_all_events(){
        int i = 1;
        System.out.println(" --- EVENTS -- ");
        for(Event e : events){
            System.out.print(i+". ");
            System.out.println(e.display());
            i++;
        }
        System.out.println("\n");
    }

    public static  void show_organizer_menu(){
        System.out.println("1. Create Event");
        System.out.println("2. Display Events");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
    }
    public static void Organizer() {
        System.out.println("Organizer menu");
        Main.show_organizer_menu();
        int choice = input.nextInt();
        while (choice != 3){
            if (choice == 1){
                Main.createEvent();
                Main.show_organizer_menu();
                choice = input.nextInt();
            }
            else if (choice == 2){
                if (events.isEmpty()){
                    System.out.println("No events to show");
                }
                Main.show_all_events();
                Main.show_organizer_menu();
                choice = input.nextInt();
            } else if (choice == 3) {
                break;
            }
        }
    }
    public static void add_participant(){
        System.out.println("Enter your details: ");
        System.out.print("Name: ");
        String participant_name = input.next();
        System.out.print("Email ID: ");
        String participant_email = input.next();
        System.out.print("ContactNo: ");
        String participant_contact_no = input.next();
        Participant p1 = new Participant(participant_name, participant_email, participant_contact_no);
        participants.add(p1);
    }
    public static void participant_menu(){
        System.out.println("1. View all events");
        System.out.println("2. Register for an event");
        System.out.println("3. Exit");
    }
    public static Event selectEvent(){
        System.out.print("Enter Event Number: ");
        int event_number = input.nextInt();
        int totalEvents = events.size();
        if (totalEvents > 0 && event_number > 0 && event_number <= totalEvents ){
            return events.get(event_number-1);
        }
        else{
            System.out.println("Invalid selection");
            return null;
        }



    }
    public static void participant(){
        System.out.println("\t--- Participant menu ---\n");
        System.out.println("Enter choice(1-3): ");
        int  choice = input.nextInt();
        while (choice != 3){
            if (choice == 1){
                Main.show_all_events();
                Main.participant_menu();
                choice = input.nextInt();
            }
            else if (choice == 2){
                Main.add_participant();
                show_all_events();
                System.out.println("\nSelect the Event");
                Event selectedEvent = Main.selectEvent();
            }
            else if (choice == 3){
                break;
            }
        }
    }

    public static void registerParticipantForEvent(){
        System.out.println("\n --- Participant Registration ---\n");
        Main.add_participant();
    }

    public static void initializeSystem() {
            System.out.println(" ===== Welcome to Event Management System =====");
            System.out.println("1. Organizer");
            System.out.println(("2. Participant"));
            System.out.print("you are: ");
            int choice =  input.nextInt();
            if (choice == 1){
                if (organizer == null){
                    organizer = Main.registerOrganizer();
                }
                else {
                    organizer.toString();
                }
                Main.Organizer();
            }
            else if (choice == 2){
                Main.participant();
            }
        }

    public static void main(String[] args){

        while (true) {
            Main.initializeSystem();
        }

    }
}