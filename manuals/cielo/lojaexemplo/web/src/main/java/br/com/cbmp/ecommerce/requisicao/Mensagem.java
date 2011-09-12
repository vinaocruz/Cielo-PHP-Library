package br.com.cbmp.ecommerce.requisicao;

import java.util.Formatter;
import java.util.Locale;

import br.com.cbmp.ecommerce.contexto.Loja;

public abstract class Mensagem {
	
	private Loja loja;
	
	private String id;
	
	private String versao;

	public Mensagem(Loja loja) {
		this.loja = loja;
		this.id = "" + System.currentTimeMillis();
		this.versao = "1.1.0";
	}

	public Loja getLoja() {
		return loja;
	}

	public String toXml() {
		Object[] argumentos = getArgumentos();
		
		Formatter formatter = getFormatter();
		
		return formatter.format(getTemplate(), argumentos).toString();
	}
	
	abstract String getTemplate();

	abstract Object[] getArgumentos();	

	protected String getId() {
		return id;
	}
	
	Formatter getFormatter() {
		Formatter formatter = new Formatter(new Locale("pt", "BR"));
		return formatter;
	}

	String getVersao() {
		return versao;
	}	
}
