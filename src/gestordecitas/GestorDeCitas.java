package gestordecitas;

import gestordecitas.entidades.Cita;
import gestordecitas.entidades.Medico;
import gestordecitas.entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class GestorDeCitas {

    public static List<Medico> listaMedicos = new ArrayList<>();
    public static List<Paciente> listaPacientes = new ArrayList<>();
    public static List<Cita> listaCitas = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrameGestorCitas framePrincipal = new JFrameGestorCitas();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
}