package br.com.cbmp.ecommerce.requisicao;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.cbmp.ecommerce.BaseTestCase;
import br.com.cbmp.ecommerce.resposta.Transacao;

public class MensagemConsultaTest extends BaseTestCase {

	public void testToXml() throws FileNotFoundException, IOException {
		Transacao transacao = new Transacao("12345");
		
		Mensagem mensagem = new MensagemConsulta(loja, transacao);
		
		escreverParaArquivo(mensagem.toXml(), "MensagemConsulta.xml");
	}

}
