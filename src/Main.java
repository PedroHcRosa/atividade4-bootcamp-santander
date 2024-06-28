public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta salario = new ContaSalario(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		// Aplicando a taxa de manutenção na conta corrente
		((ContaCorrente) cc).aplicarTaxaDeManutencao();
		cc.imprimirExtrato();

		// Operações com a conta salário
		salario.depositar(200);
		salario.imprimirExtrato();

		// Portabilidade para conta poupança
		((ContaSalario) salario).portabilidade(poupanca);
		salario.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}