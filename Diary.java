import java.util.ArrayList;
import java.util.Date;

public class Diary {

    private Date date;
    private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private String notes;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date.toString();
    }

    public String getNotes() {
        return notes;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

}
