public class ContaCorrente extends Conta {

	private static final double TAXA_DE_MANUTENCAO = 10.0;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	public void aplicarTaxaDeManutencao() {
		this.saldo -= TAXA_DE_MANUTENCAO;
		System.out.println(String.format("Taxa de manutenção de R$ %.2f aplicada.", TAXA_DE_MANUTENCAO));
	}

	
}
