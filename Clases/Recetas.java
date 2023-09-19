public class Recetas {
    //Atributos
    private Paciente nombrePaciente;
    private Medico nombreMedicoEncargado;
    private int edad;
    private String nombreMedicamento;

    //Constructor
    public Recetas(Paciente nombrePaciente, Medico nombreMedicoEncargado, int edad, String nombreMedicamento) {
        this.nombrePaciente = nombrePaciente;
        this.nombreMedicoEncargado = nombreMedicoEncargado;
        this.edad = edad;
        this.nombreMedicamento = nombreMedicamento;
    }

    //Métodos
    public void modificarRecetas(){

    }

    public void eliminarRecetas(){
        
    }

    public void imprimirRecetas(){
        
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }
}
