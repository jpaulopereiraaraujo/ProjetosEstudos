package exerc;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String n, int id, String sx) {
		this.setNome(n);
		this.setIdade(id);
		this.setSexo(sx);
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
	}
	

}
