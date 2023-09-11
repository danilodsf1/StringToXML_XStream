
package resultados;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("pacientes")
public class Pacientes {
    private List<Paciente> pacientes; // Adicione uma lista de objetos Paciente
    
    public Pacientes() {

        pacientes = new ArrayList<Paciente>();
    }

    // Getter para a lista de pacientes
    public List<Paciente> getPacientesList() {
        return pacientes;
    }

    // Método para adicionar um paciente à lista
    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
}