package start2.exe2;

public class Main {
public static void main(String[] args) {

	filhoApronta filho = new filhoApronta();
	
	filho.deposito(100);
	
	System.out.println(filho.saldo());
	System.out.println("O valor do saque: " + filho.saqueFilho(20));
	
	
	System.out.println(filho.saldo());
	

	
}
}