import java.time.LocalDateTime;
import java.util.Scanner;

public class Main{
    static Scanner input = new Scanner(System.in);

    public static void registerOrganier(){
        System.out.println("No Organizer found");
        System.out.println("Please register an organizer!\n");
        System.out.print("Enter Organizer Name: ");
        String organizer_name = input.next();
        System.out.print("Enter Organizer Email ID: ");
        String organizer_email = input.next();
        System.out.print("Enter Organizer ContactNo: ");
        String organizer_contact_no = input.next();
        Organizer o1 = new Organizer(organizer_name, organizer_email, organizer_contact_no);
    }
    public static Venue selectVenue(){
        System.out.println(" --- Enter Venue details for the venue ---");
        System.out.print("Venue ID:");
        int  venue_id = input.nextInt();
        System.out.print("Name: ");
        String venue_name = input.next();
        System.out.print("Address: ");
        String venue_address = input.next();
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
    public static String createEvent(){
        System.out.println("Enter Event Details");
        System.out.print("Event Name: ");
        String event_name = input.next();
        LocalDateTime event_time = LocalDateTime.of(2026,01,29,13,30,00);
        Venue selectedVenue =  Main.selectVenue();
        Category selectedCategory = Main.selectCategory();
        System.out.print("Enter Total No of Tickets: ");
        int  no_of_tickets = input.nextInt();
        System.out.print("Enter ticket price: ");
        int  ticket_price = input.nextInt();
        Event e1 = new Event(event_name,event_time,selectedVenue,selectedCategory, no_of_tickets, ticket_price);
        String details = e1.display();
        return details;
    }

    public static void organizerMenu() {
        System.out.println("Organizer menu");
        System.out.println("1. Create Event");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        if (choice == 1){
            String event = Main.createEvent();
            System.out.println(event);
        }
    }
    public static void initializeSystem() {
            System.out.println(" ===== Welcome to Event Management System =====");
            System.out.println("1. Organizer");
            System.out.println(("2. Participant"));
            System.out.print("you are: ");
            int choice =  input.nextInt();
            if (choice == 1){
                Main.registerOrganier();
                Main.organizerMenu();
            }

        }

    public static void main(String[] args){

        Main.initializeSystem();


    }
}