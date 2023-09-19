public class Cita {
    //Atributos
    private Paciente nombrePaciente;
    private Medico nombreMedicoEncargado;
    private String dia;
    private int numeroDia;
    private String mes;
    private int anio;

    //Constructor
    public Cita(Paciente nombrePaciente, Medico nombreMedicoEncargado, String dia, int numeroDia, String mes, int anio) {
        this.nombrePaciente = nombrePaciente;
        this.nombreMedicoEncargado = nombreMedicoEncargado;
        this.dia = dia;
        this.numeroDia = numeroDia;
        this.mes = mes;
        this.anio = anio;
    }

    //Métodos
    public void modificarCita(){

    }

    public void eliminarCita(){

    }

    public Paciente getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(Paciente nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Medico getNombreMedicoEncargado() {
        return nombreMedicoEncargado;
    }

    public void setNombreMedicoEncargado(Medico nombreMedicoEncargado) {
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
    }
}
