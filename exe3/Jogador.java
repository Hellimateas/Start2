package start2.exe3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Jogador {

	private String nome;
	private String posicao;
	private LocalDate dataDeNascimento;
	
	
	
	public Jogador(String nome, String posicao, String text) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		this.dataDeNascimento = LocalDate.parse(text, formato);
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getPosicao() {
		return posicao;
	}



	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}



	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}



	public void setDataDeNascimento(String text) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		this.dataDeNascimento = LocalDate.parse(text, formato);
	}



	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text = dataDeNascimento.format(formatter);
		return "Player --> Name ------------- " + nome + 
			   "\n	   Position --------- " + posicao + 
			   "\n	   Born Date -------- " + text;
	}
	
	public int anos() {
		int anoNascimento = dataDeNascimento.getYear();
		LocalDateTime agora = LocalDateTime.now();
		int anoAtual = agora.getYear();
		int anos = anoAtual - anoNascimento;
		
		return anos;
	}
	
	public void aposentadoria() {
		int aposentadoria;
		if(this.posicao.intern() == "Atacante") {
			int tempoAposentadoria = 35;
			aposentadoria = tempoAposentadoria - anos();
			if (aposentadoria > 0) {
				System.out.println("falta " + aposentadoria + " anos para se aposentar");
			} else if (aposentadoria <= 0 ) {
				System.out.println( "Aposentado");
			}
		} else if(this.posicao.intern() == "Meio-campo") {
			int tempoAposentadoria = 38;
			aposentadoria = tempoAposentadoria - anos();
			if (aposentadoria > 0) {
				System.out.println("falta " + aposentadoria + " anos para se aposentar");
			} else if (aposentadoria <= 0 ) {
				System.out.println("Aposentado"); 
			}
		} else if(this.posicao.intern() == "Defensor") {
			int tempoAposentadoria = 40;
			aposentadoria = tempoAposentadoria - anos();
			if (aposentadoria > 0) {
				System.out.println("falta " + aposentadoria + " anos para se aposentar");
			} else if (aposentadoria <= 0 ) {
				System.out.println( "Aposentado");
			}
		}
		
	}
	
}
