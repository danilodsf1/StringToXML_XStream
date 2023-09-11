package resultados;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XStream db = new XStream(new DomDriver());
		db.autodetectAnnotations(true);

		Cadastros cadastros = new Cadastros();

		Paciente paciente2 = new Paciente();
		paciente2.setCodigo_lis(123);
		cadastros.setPacientes(paciente2);

		ResponsavelTecnicoAssinatura assinatura1 = new ResponsavelTecnicoAssinatura();
		assinatura1.setCodigo("CRF-SP 95475");
		cadastros.setResponsaveisTecnicosAssinatura(assinatura1);

		Material material1 = new Material();
		material1.setDescricao("soro");
		material1.setCodigo(10);
		cadastros.setMaterial(material1);


		

		Resultados resultados = new Resultados();
		resultados.setDatahora("2023-09-05 09:20:55");
		resultados.setOrigem("aol");
		resultados.setVersao(20101018);
		resultados.setCadastros(cadastros);
		
		Solicitacao solicitacao1 = new Solicitacao();
		solicitacao1.setCodigo(293159046);
		solicitacao1.setCodigo_aol(2020);
		solicitacao1.setCodigo_lis(1691005085);
		solicitacao1.setPaciente(324644691);
		solicitacao1.setDataColeta("2023-08-02 16:38:05");
		
		Amostra amostra1 = new Amostra();
		amostra1.setCodigo(293159046);
		amostra1.setDescricao("Basal");
		amostra1.setIdentificacao("Basal 123");
		amostra1.setMaterial("543");
		solicitacao1.setAmostra(amostra1);


		resultados.setSolicitacao(solicitacao1);

		System.out.println(db.toXML(resultados));
	}
}
