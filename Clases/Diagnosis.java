import java.util.Date;

public class Diagnosis {
    //Atributos
    private Patient patient;
    private Doctor doctorInCharge;
    private Date date;

    public Diagnosis(Patient patient, Doctor doctorInCharge, Date date) {
        this.patient = patient;
        this.doctorInCharge = doctorInCharge;
        this.date = date;
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
    /*
    //Constructor
    public Diagnosis(Patient nombrePaciente, Doctor nombreMedicoEncargado, String dia, int numeroDia, String mes, int anio) {
        this.nombrePaciente = nombrePaciente;
        this.nombreMedicoEncargado = nombreMedicoEncargado;
        this.dia = dia;
        this.numeroDia = numeroDia;
        this.mes = mes;
        this.anio = anio;
    }

    //Métodos
    public void modificarDiagnostico(){

    }

    public void eliminarDiagnostico(){
        
    }

    public Patient getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(Patient nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Doctor getNombreMedicoEncargado() {
        return nombreMedicoEncargado;
    }

    public void setNombreMedicoEncargado(Doctor nombreMedicoEncargado) {
        this.nombreMedicoEncargado = nombreMedicoEncargado;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }*/
}
