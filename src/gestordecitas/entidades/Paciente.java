package gestordecitas.entidades;

/**
 *
 * @author Andres
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String telefono;
    private String sexoBiologico;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    
    public String mostrarDatos() { 
        return this.getDni() + " - " + this.getNombre() + " - " 
                + this.getTelefono() + " - " + this.getSexoBiologico();
    }
}
