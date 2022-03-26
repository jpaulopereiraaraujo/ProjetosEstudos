package animal.polimorfismo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero m1 = new Mamifero();
		Reptil r1 = new Reptil();
		Peixe p1  = new Peixe();
		Ave a1 = new Ave();
		
		m1.setPeso(85.3f);
		m1.setCorPelo("Marrom");
		m1.locomover();
		
		
	}

}
