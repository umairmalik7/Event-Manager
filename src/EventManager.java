// EventManager.java
import java.util.ArrayList;

public class EventManager {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public Event getEventByNumber(int number) {
        if (number > 0 && number <= events.size()) {
            return events.get(number - 1);
        }
        return null;
    }
}