package com.example.demo;
import org.springframework.context.annotation.*;

public class AppConfig {

	@Bean
	public Livro getLivro() {
		return new Livro();
	}
	// <bean id = "Livro" class = "com.springbeans.Livro"/>
	@Bean
	public AutorLivro getAutorLivro() {
		return new Autor();
	}


}
