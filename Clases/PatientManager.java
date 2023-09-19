import java.util.List;

public interface PatientManager {
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    Patient addPatient(Patient patient);
    Patient updatePatient(Patient patient);
    void deletePatient(int id);
}
