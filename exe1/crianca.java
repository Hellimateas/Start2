package start2.exe1;

import java.util.HashMap;
import java.util.Map;

public class crianca {
	private String nome;
	private String personalidade;
	Map<String,String> crianca = new HashMap<String, String>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPersonalidade() {
		return personalidade;
	}
	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}

	public void hashMapCrianca(String nome, String personalidade) {
		this.crianca.put(nome, personalidade);
	}
	@Override
	public String toString() {
		return "crianca [crianca=" + crianca + "]";
	}
	
	
}
