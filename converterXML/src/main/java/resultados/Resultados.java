package resultados;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("resultados")
public class Resultados {
	private  Cadastros cadastros;
	private Solicitacao solicitacao;


	@XStreamAsAttribute
	private String datahora;
	@XStreamAsAttribute
	private String origem;
	@XStreamAsAttribute
	private int versao;
	

	public String getDatahora() {
		return datahora;
	}

	public void setDatahora(String datahora) {
		this.datahora = datahora;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public Cadastros getCadastros() {
		return cadastros;
	}

	public void setCadastros(Cadastros cadastros) {
		this.cadastros = cadastros;
	}
	
	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	
	

}
