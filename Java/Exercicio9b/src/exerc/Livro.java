package exerc;

public class Livro implements Publicação {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String tit, String aut, int tPg, Pessoa l) {
		this.setTitulo(tit);
		this.setTotPaginas(tPg);
		this.setAutor(aut);
		this.setPagAtual(1);
		this.setAberto(false);
		this.setLeitor(l);;
	}
	
	public void detalhes() {
		System.out.println("Detalhes do livro======");
		System.out.println("Título do livro: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de páginas: " + this.getTotPaginas());
		System.out.println("Página atual: " + this.getPagAtual());	
		System.out.println("Atualmente " + leitor.getNome() + " está lendo o livro.");
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	@Override
	public void abrir() {
		this.setAberto(true);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
		
	}
	@Override
	public void folhear(int p) {	
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void avancarPag() {
		this.setPagAtual(this.pagAtual + 1);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void voltarPag() {
		if (this.getPagAtual() == 1) {
			System.out.println("Não há páginas para retroceder.");
			System.out.println("Você está na página: " + this.getPagAtual());
		}else {
			this.setPagAtual(pagAtual - 1);
			System.out.println("Você está na página: " + this.getPagAtual());
			
		}
		// TODO Auto-generated method stub
		
	}

}
