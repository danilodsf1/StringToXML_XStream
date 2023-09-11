package resultados;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("amostra")
public class Amostra {
	@XStreamAsAttribute
	private int codigo;
	@XStreamAsAttribute
	private String descricao, identificacao, material;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {	
		this.codigo = codigo;
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
