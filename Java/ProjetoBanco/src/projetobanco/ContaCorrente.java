package projetobanco;

public class ContaCorrente extends Conta {

	public ContaCorrente(User cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente==");
		super.imprimirInfosComuns();
		
	}
	
	
}
