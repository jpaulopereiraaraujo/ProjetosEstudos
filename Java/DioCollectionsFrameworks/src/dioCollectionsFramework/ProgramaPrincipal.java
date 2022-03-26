package dioCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> notas = new ArrayList<Double>();
		for ( int i = 0; i <= 7; i++) {
			Random r = new Random();
			double randomValue = 0 + (10 - 0) * r.nextDouble();// double aleatorio 0 a 10
			notas.add(randomValue);// add() adiciona a lista o parametro desejado
		
		}
		
		notas.add(4,8d);// adiciona na posicao 4 o elemento 8.0
		System.out.println(notas.toString()); // . toString() imprime a lista na tela
		System.out.println(notas.indexOf(8d));// retorna a posicao do objeto dentro da lista
		notas.set(notas.indexOf(8d), 6.0);// addiciona no lugar de 8.0 o 6.0
		System.out.println(notas.toString());
		System.out.println(notas.contains(8d));// verifica sem o objeto 8.0 esta na lista
		for (Double nota : notas) System.out.println(nota);// imprime um vez cada elemento de notas
		System.out.println(notas.get(4));// imprime o elemento na posicao 4
		System.out.println(Collections.min(notas));//utiliza a interface Comparable
		System.out.println(Collections.max(notas));//o minimo
		
		System.out.println("Somando elementos da lista");
		Iterator <Double> iterator = notas.iterator();// esse iterator checa cada elemento da lista
		Double soma = 0d;
		while (iterator.hasNext()) {// enquanto existir o proximo elemento da lista o loop continua
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		System.out.println(soma/notas.size());// media, o .size() retorna o tamanho da lista
		
		notas.remove(6d);//remove objeto 6.0 da lista
		notas.add(6d);
		notas.remove(0);// remove o objeto na posicao 0 da lista
		System.out.println(notas);
		
		Iterator <Double> iterator1 = notas.iterator();
		
		while(iterator.hasNext()) { // percorre a lista e remove os  elementos menores que 3
			Double next = iterator1.next();
			if (next < 3) iterator1.remove();
		}
		System.out.println(notas);
		
		notas.clear();//apaga a lista
		System.out.println(notas.isEmpty());// retorna se a lista esta vazia
		
		
		
		
		/*Double soma = 0d; // pode ser feito assim tbm
		for (Double nota: notas) {
			soma = nota + soma;
			System.out.println(soma);
		}
	*/
	}

}
