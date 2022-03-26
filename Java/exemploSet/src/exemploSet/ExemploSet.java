package exemploSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6d));
		System.out.println(notas.toString());// imprime a lista
		System.out.println(notas.contains(5d));// informa se contem o elemento 5.0
		System.out.println(Collections.min(notas));// informa menor nota
		System.out.println(Collections.max(notas));// informa maior nota
		
		Iterator <Double> iterator = notas.iterator();// realiza a soma de todos os elementos
		Double soma = 0.0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println(soma);
		System.out.println(soma/notas.size());// .size() retorna o tamanho da lista
		notas.remove(8d);
		
		Iterator <Double> iterator1 = notas.iterator();
		
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(8d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		Set<Double> notas3 = new TreeSet<>(notas2);// o TreeSet ordena de forma natural os elementos
		System.out.println(notas3);
		notas.clear();// Apaga todo o conteudo
		notas.isEmpty(); //retorna se esta vazio
		
		} 

}
