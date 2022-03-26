package projetobanco;

public class User {
	private String nomeUsuario;
	private int idadeUsuario;
	private String sexoUsuario;
	private double rendaUsuario;
	
	
	
	public User(String nomeUsuario, int idadeUsuario, String sexoUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.idadeUsuario = idadeUsuario;
		this.sexoUsuario = sexoUsuario;
	}
	
	
	
	public double getRendaUsuario() {
		return rendaUsuario;
	}



	public void setRendaUsuario(double rendaUsuario) {
		this.rendaUsuario = rendaUsuario;
	}



	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getIdadeUsuario() {
		return idadeUsuario;
	}
	public void setIdadeUsuario(int idadeUsuario) {
		this.idadeUsuario = idadeUsuario;
	}
	public String getSexoUsuario() {
		return sexoUsuario;
	}
	public void setSexoUsuario(String sexoUsuario) {
		this.sexoUsuario = sexoUsuario;
	}
	
	
	

}
