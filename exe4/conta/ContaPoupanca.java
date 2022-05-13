package start2.exe4.conta;

public class ContaPoupanca extends Conta {
	@Override
	public double rendimento() {
		setSaldo(getSaldo() + getSaldo()*0.07);
		return getSaldo();
	} 
}
