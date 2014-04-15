public class RepositorioContasArray implements RepositorioContas {
	private Conta[] contas;
	int indice;
	boolean acho;
	boolean achou;
	Conta c;

	public Conta procurar(String numero) throws ContaNaoEncontradaException {

		for (int i = 0; i < indice && !acho; i++) {

		}

		if (!achou) {
			throw new ContaNaoEncontradaException();
		}
		return c;

	}

}
