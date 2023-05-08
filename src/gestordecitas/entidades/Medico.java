package gestordecitas.entidades;

import java.util.List;

/**
 *
 * @author Andres
 */
public class Medico {
    private String CMP;
    private String nombre;
    private List<Especialidad> especialidades;

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    public String mostrarDatos() {
        return this.getCMP() + " - " + this.getNombre();
    }
}
