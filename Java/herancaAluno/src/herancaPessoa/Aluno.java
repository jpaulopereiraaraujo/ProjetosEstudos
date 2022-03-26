package herancaPessoa;

public class Aluno extends Pessoa {
	
	private  int matr;
	private String curso;
	
	
	
	public Aluno(int matr, String curso) {
		super();
		this.matr = matr;
		this.curso = curso;
	}
	
	
	

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getMatr() {
		return matr;
	}



	public void setMatr(int matr) {
		this.matr = matr;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public void cancelarMatr() {
		System.out.println("Mátricula será cancelada.");
		
	}

}
