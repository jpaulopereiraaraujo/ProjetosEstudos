package exemploOrdSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IMPRIMINDO LISTA ALETORIA
		Set<Series> minhasSeries = new HashSet<>();
		minhasSeries.add(new Series("got", "fantasia", 60));
		minhasSeries.add(new Series("dark", "drama", 60));
		minhasSeries.add(new Series("that '70s show", "comedia", 25));
		System.out.println(minhasSeries);
		
		for (Series serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero()
		+ " - " + serie.getTempoEpisodio());
		
		
		//ORDEM DE INSERCAO
		Set<Series> minhasSeries1 = new LinkedHashSet<>();
		minhasSeries1.add(new Series("got", "fantasia", 60));
		minhasSeries1.add(new Series("dark", "drama", 60));
		minhasSeries1.add(new Series("that '70s show", "comedia", 25));
		System.out.println(minhasSeries1);
		
		for (Series serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero()
		+ " - " + serie.getTempoEpisodio());
		
		//IMPRIMENDO ORDEM NATURAL
		
		Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
		System.out.println(minhasSeries2);

	}
}
