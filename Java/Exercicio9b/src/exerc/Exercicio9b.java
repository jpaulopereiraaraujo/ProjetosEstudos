package exerc;

public class Exercicio9b {

	public static void main(String[] args) {
	
		
		
		Livro livro[] = new Livro[3];
		Pessoa p[] = new Pessoa[2];
		p[0] = new Pessoa("Paulo", 22, "Masculino");
		p[1] = new Pessoa ("Marita", 15, "Feminino");
		
		livro[0] = new Livro("A vida de Paulo", "Ricardo Millos", 696, p[0] );
		livro[1] = new Livro ("Vida de ribeirinho", "Ze Zeca", 800, p[1]);
		livro [2] = new Livro ("Vida de Macaco", "Donkey Kong", 112, p[0]);
		
		livro[0].detalhes();
		// TODO Auto-generated method stub

	}

}
