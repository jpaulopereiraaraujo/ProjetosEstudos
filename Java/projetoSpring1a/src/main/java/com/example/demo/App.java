package com.example.demo;

import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Harry Potter");
		livro.setCodigo("dsarsa");
		livro.exibir();
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("JKR");
		((AbstractApplicationContext) factory).close();
	}
}
