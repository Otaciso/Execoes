public class Conta {
	private String numero;
	private double saldo;

	public void debitar(double valor) throws SaldoInsuficienteException {
		saldo = saldo - valor;

		if (valor <= saldo) {
			saldo = saldo - valor;

		} else {
			SaldoInsuficienteException e;
			e = new SaldoInsuficienteException(saldo, numero);
			throw e;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
