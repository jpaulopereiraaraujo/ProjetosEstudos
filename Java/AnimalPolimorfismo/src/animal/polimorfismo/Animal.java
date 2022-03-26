package animal.polimorfismo;

public abstract class Animal {
	protected double peso;
	protected int idade;
	protected int qtdMembros;
	
	
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getQtdMembros() {
		return qtdMembros;
	}
	public void setQtdMembros(int qtdMembros) {
		this.qtdMembros = qtdMembros;
	}
	
	

}
