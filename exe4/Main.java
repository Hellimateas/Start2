package start2.exe4;

import start2.exe4.conta.ContaCorrente;
import start2.exe4.conta.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		ContaCorrente felipe = new ContaCorrente();
		System.out.println(felipe.getSaldo());
		
		felipe.setSaldo(50);
		System.out.println(felipe.getSaldo());
		
		System.out.println(felipe.rendimento());
		
		
		System.out.println("==========================");
		
		ContaPoupanca david = new ContaPoupanca();
		
		System.out.println(david.getSaldo());
		david.setSaldo(100);
		
		System.out.println(david.rendimento());
		
	}

}
