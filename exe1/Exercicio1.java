package start2.exe1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean pont;
		crianca crianca = new crianca();
		int entregue = 0;
		String verificador = "sim";

		do {

			System.out.println("Criancinha, qual � o seu nome? ");
			String nome = input.next();
			System.out.println("e voc� se comportou esse ano?(sim/n�o)");
			String personalidade = input.next();
			
			crianca.hashMapCrianca(nome, personalidade);
			
			System.out.println("Existe alguma crian�a? \n se sim, digite 1. se n�o, digite 0. ");
			int ponteiro = input.nextInt();
			
			pont = ponteiro == 1 ? true : false;
		} while (pont == true);
		
		for(String key:crianca.crianca.keySet()) {
			String valor = crianca.crianca.get(key);
			if(valor.intern() == verificador)
				entregue++;
		}
		
		System.out.printf("foram entregues %d presentes", entregue);
		input.close();
	}
}
