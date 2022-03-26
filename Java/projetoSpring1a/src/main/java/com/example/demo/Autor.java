package com.example.demo;

public class Autor implements AutorLivro{
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void exibir() {
		System.out.println(" Autor: " + this.getNome());
	}

	@Override
	public void exibirAutor() {
		// TODO Auto-generated method stub
		
	}
	

}
