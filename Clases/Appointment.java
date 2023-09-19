import java.util.Date;

public class Appointment {
    //Atributos
    private Patient patient;
    private Doctor doctorInCharge;
    private Date date;
    private Long id;
    private String reasonForConsultation;

    public Appointment(Patient patient, Doctor doctorInCharge, Date date, Long id, String reasonForConsultation) {
        this.patient = patient;
        this.doctorInCharge = doctorInCharge;
        this.date = date;
        this.id = id;
        this.reasonForConsultation = reasonForConsultation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReasonForConsultation() {
        return reasonForConsultation;
    }

    public void setReasonForConsultation(String reasonForConsultation) {
        this.reasonForConsultation = reasonForConsultation;
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
}
