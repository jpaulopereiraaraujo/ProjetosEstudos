package projetobanco;

public class ContaPoupanca extends Conta{
	
	
	public ContaPoupanca(User cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Poupanca===");
		super.imprimirInfosComuns();
		
		
	}
	
		
}
