package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("Um curso muito bom em java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("Um curso muito bom de js");
		curso2.setCargaHoraria(5);
		
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Os mentores são shows");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("bootcamp Java Dev");
		bootcamp.setDescricao("Um bootcamp muito bom");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Devs devCamila = new Devs();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
		System.out.println("XP" + devCamila.calcularTotalXp());
		
		System.out.println("++++++++++++++++++++++");
		
		Devs devJoao = new Devs();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
		System.out.println("XP" + devJoao.calcularTotalXp());
		
		// TODO Auto-generated method stub
	
	}

}
