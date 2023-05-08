package gestordecitas.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Andres
 */
public class Cita {
    private Date fecha;
    private int hora;
    private Medico medico;
    private Paciente paciente;
    private Especialidad especialidad;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String mostrarDatos() {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = formatoFecha.format(fecha);
        
        String horaFormato24 = String.format("%02d:00", hora);
        if (hora < 12) {
            horaFormato24 += " AM";
        } else {
            horaFormato24 += " PM";
        }
        
        return  this.getPaciente().getNombre() + " - " + this.getPaciente().getDni()
                        + " - " + fechaString + " - " +  horaFormato24;
    }
}
