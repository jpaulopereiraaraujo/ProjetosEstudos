package herancaAluno2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante p1 = new Visitante();
		p1.setNome("Biruliru");
		p1.setIdade(33);
		p1.setSexo("M");
		System.out.println(p1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Charles");
		a1.setMatricula(1010);
		a1.setCurso("Admin");
		a1.setIdade(16);
		a1.setSexo(null);
		System.out.println(a1.toString());
	}

}
