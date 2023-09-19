import java.util.List;

public class Assistant extends User implements PatientManager, AppointmentManager{
    public Assistant(String name, String lastName, String email) {
        super(name, lastName, email);
    }
    //Métodos
    public void createAppointment(){

    }

    public void updateAppointment(){

    }
    @Override
    public void displayUserInfo() {

    }

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public Patient getPatientById(int id) {
        return null;
    }

    @Override
    public Patient addPatient(Patient patient) {
        return null;
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return null;
    }

    @Override
    public void deletePatient(int id) {

    }

    @Override
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @Override
    public Appointment getAppointmentById(int id) {
        return null;
    }

    @Override
    public Appointment addAppintment(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return null;
    }

    @Override
    public void deleteAppointment(int id) {

    }
}