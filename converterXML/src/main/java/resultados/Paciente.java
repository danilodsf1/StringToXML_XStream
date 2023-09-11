package resultados;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("paciente")

public class Paciente {
	@XStreamAsAttribute
	private int codigo, codigo_lis;
	@XStreamAsAttribute
	private String datanasc, nome, nomeSocial;
	@XStreamAsAttribute
	private char sexo;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo_lis() {
		return codigo_lis;
	}
	public void setCodigo_lis(int codigo_lis) {
		this.codigo_lis = codigo_lis;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeSocial() {
		return nomeSocial;
	}
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

}
