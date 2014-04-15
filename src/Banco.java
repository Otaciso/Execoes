public class Banco {
	private RepositorioContas contas;
	double valor;

	public void debitar(String n, double v) throws SaldoInsuficienteException,
			ContaNaoEncontradaException {
		Conta c = contas.procurar(n);

		c.debitar(valor);

	}

}
