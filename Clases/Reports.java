import java.util.Date;

public class Reports {
    //Atributos
    private Patient patient;
    private Doctor doctorInCharge;
    private Date date;
    private String description;
    private Diagnosis diagnosis;
    private String treatment;

    public Reports(Patient patient, Doctor doctorInCharge, Date date, String description, Diagnosis diagnosis, String treatment) {
        this.patient =patient;
        this.doctorInCharge = doctorInCharge;
        this.date = date;
        this.description = description;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }
    //Métodos
    public void modificarReporte(){

    }

    public void eliminarReportes(){

    }

    public void imprimirReportes(){

    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctorInCharge() {
        return doctorInCharge;
    }

    public void setDoctorInCharge(Doctor doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
