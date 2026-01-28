// Main.java
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Organizer organizer = null;
    static Scanner input = new Scanner(System.in);

    static EventManager eventManager = new EventManager();
    static ParticipantManager participantManager = new ParticipantManager();
    static TicketManager ticketManager = new TicketManager();
    static PaymentProcessor paymentProcessor = new PaymentProcessor();

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Welcome to Event Management System =====");
            System.out.println("1. Organizer");
            System.out.println("2. Participant");
            System.out.println("3. Exit");
            System.out.print("You choice(1-3): ");
            int choice = input.nextInt();
            input.nextLine(); // Clean input

            if (choice == 1) {
                if (organizer == null) {
                    organizer = registerOrganizer();
                }
                organizerMenu();
            }
            else if (choice == 2) {
                participantMenu();
            }
            else if (choice == 3) {
                System.exit(0);
            }
        }
    }

    // Organizer part
    public static Organizer registerOrganizer() {
        System.out.print("Organizer Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Contact: ");
        String contact = input.nextLine();
        return new Organizer(name, email, contact);
    }

    public static void organizerMenu() {
        while (true) {
            System.out.println("\nOrganizer Menu:");
            System.out.println("1. Create Event");
            System.out.println("2. Show Events");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                createEvent();
            } else if (choice == 2) {
                showAllEvents();
            } else if (choice == 3) {
                return;
            }
        }
    }

    public static void createEvent() {
        System.out.print("Event Name: ");
        String name = input.nextLine();
        LocalDateTime date = LocalDateTime.of(2026, 1, 29, 13, 30, 0);

        Venue venue = createVenue();
        Category category = createCategory();

        System.out.print("Total Tickets: ");
        int totalTickets = input.nextInt();
        System.out.print("Ticket Price: ");
        int price = input.nextInt();
        input.nextLine();

        Event event = new Event(name, date, venue, organizer, category, totalTickets, price);
        eventManager.addEvent(event);
        System.out.println("Event created!");
    }

    public static Venue createVenue() {
        System.out.print("Venue ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Venue Name: ");
        String name = input.nextLine();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.print("Capacity: ");
        int capacity = input.nextInt();
        input.nextLine();
        return new Venue(id, name, address, capacity);
    }

    public static Category createCategory() {
        System.out.print("Category ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Category Name: ");
        String name = input.nextLine();
        return new Category(id, name);
    }

    // Participant part
    public static void participantMenu() {
        while (true) {
            System.out.println("\nParticipant Menu:");
            System.out.println("1. Show Events");
            System.out.println("2. Register for Event");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                showAllEvents();
            } else if (choice == 2) {
                registerForEvent();
            } else if (choice == 3) {
                return;
            }
        }
    }

    public static void registerForEvent() {
        showAllEvents();
        System.out.print("Enter Event Number: ");
        int number = input.nextInt();
        input.nextLine();
        Event event = eventManager.getEventByNumber(number);
        if (event == null) {
            System.out.println("Invalid event.");
            return;
        }

        Participant participant = createParticipant();
        participantManager.addParticipant(participant);

        Ticket ticket = ticketManager.createTicket(event, participant);

        // Simple payment
        Payment payment = paymentProcessor.makePayment(event.getTicketPrice(), "Cash");

        // Create registration
        Registration reg = new Registration(1, event, participant, ticket, payment);
        System.out.println("Registered! " + reg.toString());
    }

    public static Participant createParticipant() {
        System.out.print("Your Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Contact: ");
        String contact = input.nextLine();
        return new Participant(name, email, contact);
    }

    // Show events
    public static void showAllEvents() {
        ArrayList<Event> events = eventManager.getEvents();
        if (events.isEmpty()) {
            System.out.println("No events.");
            return;
        }
        System.out.println("--- Events ---");
        for (int i = 0; i < events.size(); i++) {
            System.out.println((i + 1) + ". " + events.get(i).display());
        }
    }
}