public class Paciente {
    //Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private Medico nombreMedicoEncargado;
    private String correoElectronico;
    private String numeroTelefono;

    //Constructor
    public Paciente(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, Medico nombreMedicoEncargado, String correoElectronico, String numeroTelefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.nombreMedicoEncargado = nombreMedicoEncargado;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Medico getNombreMedicoEncargado() {
        return nombreMedicoEncargado;
    }

    public void setNombreMedicoEncargado(Medico nombreMedicoEncargado) {
        this.nombreMedicoEncargado = nombreMedicoEncargado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
