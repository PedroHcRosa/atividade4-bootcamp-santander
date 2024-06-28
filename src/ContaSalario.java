public class ContaSalario extends Conta {


    @Override
	public void sacar(double valor) {
		saldo -= valor;
	}


    @Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    public ContaSalario(Cliente cliente) {
        super(cliente);
        
    }

    public void portabilidade(Conta contaDestino) {
        contaDestino.depositar(saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salário ===");
		super.imprimirInfosComuns();
    }
    
}
