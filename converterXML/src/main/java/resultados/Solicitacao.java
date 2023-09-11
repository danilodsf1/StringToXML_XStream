package resultados;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Solicitacao {
	@XStreamAsAttribute
	private int codigo, codigo_aol, codigo_lis, paciente;
	@XStreamAsAttribute
	private String dataColeta;
	
	private Amostra amostra;
	
	public Amostra getAmostra() {
		return amostra;
	}
	private List<Amostra> amostras = new ArrayList<Amostra>();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo_aol() {
		return codigo_aol;
	}
	public void setCodigo_aol(int codigo_aol) {
		this.codigo_aol = codigo_aol;
	}
	public int getCodigo_lis() {
		return codigo_lis;
	}
	public void setCodigo_lis(int codigo_lis) {
		this.codigo_lis = codigo_lis;
	}

	public String getDataColeta() {
		return dataColeta;
	}
	public void setDataColeta(String dataColeta) {
		this.dataColeta = dataColeta;
	}
	public int getPaciente() {
		return paciente;
	}
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	
	public List<Amostra> getAmostras(){
		return amostras;
	}
	public void setAmostra (Amostra amostras) {
		this.amostras.add(amostras);
	}

}
