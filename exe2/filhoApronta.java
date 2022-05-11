package start2.exe2;

public class filhoApronta extends mesada{
	
	public double saqueFilho(double saque) {
	saque(saque);
	double cashback =(saque*0.005);
	saque = saque - cashback;
	
	return saque;
	}
	
	
}
