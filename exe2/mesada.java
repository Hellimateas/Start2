package start2.exe2;

public class mesada {
	
	private double saldo;
	
	public double saldo() {
		return this.saldo;
	}
	
	public void deposito(double dep) {
		this.saldo = this.saldo + dep;
	}

	public void saque(double saque) {
		this.saldo = saldo - saque;
	}

}
