import java.util.List;

public class Doctor extends User implements PatientManager{
    //Atributos
    private String specialty;
    private Prescription prescription;
    private Reports reports;
    private Diagnosis diagnosis;

    public Doctor(String name, String lastName, String email, String specialty, Prescription prescription, Reports reports, Diagnosis diagnosis) {
        super(name, lastName, email);
        this.specialty = specialty;
        this.prescription = prescription;
        this.reports = reports;
        this.diagnosis = diagnosis;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Reports getReports() {
        return reports;
    }

    public void setReports(Reports reports) {
        this.reports = reports;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    //Métodos
    public void createDiagnosis(){

    }

    public void createPrescription(){

    }

    public void writeReport(){

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
}
