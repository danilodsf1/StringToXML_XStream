package resultados;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("cadastros")
public class Cadastros {
	
	private List<Paciente> pacientes = new ArrayList<Paciente>();
	
	private List<ResponsavelTecnicoAssinatura> responsaveisTecnicosAssinatura = new ArrayList<ResponsavelTecnicoAssinatura>();
	
	private List<Material> materiais = new ArrayList<Material>();
	

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Paciente paciente) {
		this.pacientes.add(paciente);
	}
	
	public List<Material> getMaterial(){
		return materiais;
	}
	
	public void setMaterial (Material material) {
		this.materiais.add(material);
	}
	public List<ResponsavelTecnicoAssinatura> getResponsaveisTecnicosAssinatura(){
		return responsaveisTecnicosAssinatura;
		
	}

	public void setResponsaveisTecnicosAssinatura (ResponsavelTecnicoAssinatura responsavelTecnicoAssinatura) {
    this.responsaveisTecnicosAssinatura.add(responsavelTecnicoAssinatura);
	}

}