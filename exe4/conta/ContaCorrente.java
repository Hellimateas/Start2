package start2.exe4.conta;

public class ContaCorrente extends Conta{

	@Override
	public double rendimento() {
		setSaldo(getSaldo() + getSaldo()*0.05);
		return getSaldo();
	} 
}
