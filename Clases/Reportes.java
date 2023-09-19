public class Reportes {
    //Atributos
    private Paciente nombrePaciente;
    private Medico nombreMedicoEncargado;
    private String dia;
    private int numeroDia;
    private String mes;
    private int anio;
    private String descripcionInforme;
    private Diagnostico diagnostico;
    private String tratamiento;

    //Constructor
    public Reportes(Paciente nombrePaciente, Medico nombreMedicoEncargado, String dia, int numeroDia, String mes, int anio, String descripcionInforme, Diagnostico diagnostico, String tratamiento) {
        this.nombrePaciente = nombrePaciente;
        this.nombreMedicoEncargado = nombreMedicoEncargado;
        this.dia = dia;
        this.numeroDia = numeroDia;
        this.mes = mes;
        this.anio = anio;
        this.descripcionInforme = descripcionInforme;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    //Métodos
    public void modificarReporte(){

    }

    public void eliminarReportes(){
        
    }

    public void imprimirReportes(){
        
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

    public String getDescripcionInforme() {
        return descripcionInforme;
    }

    public void setDescripcionInforme(String descripcionInforme) {
        this.descripcionInforme = descripcionInforme;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
