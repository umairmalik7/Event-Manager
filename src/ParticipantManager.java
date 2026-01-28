// ParticipantManager.java
import java.util.ArrayList;

public class ParticipantManager {
    private ArrayList<Participant> participants = new ArrayList<>();

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }
}