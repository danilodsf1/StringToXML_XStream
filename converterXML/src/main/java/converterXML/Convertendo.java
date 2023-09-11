package converterXML;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias("Pessoa")
public class Convertendo {

    public static void main(String[] args) {
        XStream x = new XStream(new DomDriver());
        
        // Ative a detecção automática de anotações
        x.autodetectAnnotations(true);

        Pessoa cadastro1 = new Pessoa();
        cadastro1.setNome("Danilo");
        cadastro1.setSobreNome("França");
        cadastro1.setIdade(56);
        cadastro1.setDias(36);
       

        System.out.println(x.toXML(cadastro1));
    }
}
