import java.util.List;

public interface AppointmentManager {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(int id);
    Appointment addAppintment(Appointment appointment);
    Appointment updateAppointment(Appointment appointment);
    void deleteAppointment(int id);
}
