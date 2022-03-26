package projetobanco;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		User jppa = new User("Joao Paulo", 32 , "M");
		User lfds = new User("Lais Ferreira", 35, "F");
		
		Conta cc = new ContaCorrente(jppa);
		Conta poup = new ContaPoupanca(lfds);
		
		cc.imprimirExtrato();
		poup.imprimirExtrato();
		
	}

}
