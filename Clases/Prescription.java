public class Prescription {
    //Atributos
    private Patient patient;
    private Doctor doctorInCharge;
    private String medicineName;

    public Prescription(Patient patient, Doctor doctorInCharge, String medicineName) {
        this.patient = patient;
        this.doctorInCharge = doctorInCharge;
        this.medicineName = medicineName;
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

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
}
