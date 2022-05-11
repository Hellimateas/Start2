package start2.exe2;

public class FilhoNaoApronta extends mesada {
	public double saqueFilho(double saque) {
		saque(saque);
		double cashback =(saque*0.001);
		saque = saque - cashback;
		
		return saque;
		}
}
