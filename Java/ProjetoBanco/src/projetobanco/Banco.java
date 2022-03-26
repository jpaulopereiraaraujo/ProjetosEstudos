package projetobanco;

import java.util.List;

public class Banco {
	private String nomeBanco;
	private List<Conta> contasBanco;

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public List<Conta> getContasBanco() {
		return contasBanco;
	}

	public void setContasBanco(List<Conta> contasBanco) {
		this.contasBanco = contasBanco;
	}
	
	
	
	
}
