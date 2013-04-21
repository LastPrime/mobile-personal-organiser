import java.util.ArrayList;

public class Appointment {

    private String name;
    private String description;
    private String venue;
    private Time time;
    private ArrayList<String> participants = new ArrayList<String>();

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVenue() {
        return venue;
    }

    public String getTime() {
        return time.toString();
    }

    public void addParticipant(String participant) {
        participants.add(participant);
    }

    public void removeParticipant(String participant) {
        participants.remove(participant);
    }

}
