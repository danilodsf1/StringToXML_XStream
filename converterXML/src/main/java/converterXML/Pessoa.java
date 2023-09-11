package converterXML;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("Pessoa") // para renomear o nome no xml
public class Pessoa {
	
	private String nome;
	
	private String sobreNome;
	@XStreamAsAttribute // para atribuir a classe principal,neste caso a Pessoa.
	private int idade;
	private float dias;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getDias() {
		return dias;
	}
	public void setDias(float dias) {
		this.dias = dias;
	}

}
