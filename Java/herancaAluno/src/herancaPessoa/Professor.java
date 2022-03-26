package herancaPessoa;

public class Professor extends Pessoa {
	
	private String especialidade;
	private double salario;
	
	
	
	
	
	public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	public Professor() {
		
	}


	public String getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public  void receberAumento(float num) {
		this.setSalario(this.getSalario() + num);
	
	}
	

}
