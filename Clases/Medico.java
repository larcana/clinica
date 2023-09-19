public class Medico {
    //Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String especialidad;
    private String correoElectronico;

    //Constructor
    public Medico(String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad, String correoElectronico) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.especialidad = especialidad;
        this.correoElectronico = correoElectronico;
    }

    //Métodos
    public void crearDiagnostico(){

    }
    
    public void generarReceta(){

    }

    public void escribirReporte(){

    }

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
