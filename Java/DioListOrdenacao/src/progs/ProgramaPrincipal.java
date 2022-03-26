package progs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Gato> gatos = new ArrayList<>(); {{
		gatos.add(new Gato("Jon", 18, "preto"));
		gatos.add(new Gato("Simba", 6, "tigrado"));
		gatos.add(new Gato("Jon", 12, "amarelo"));
		
		}}
		
		System.out.println(gatos);//ordem de entrada
		
		Collections.shuffle(gatos);//lista bagunçada
		System.out.println(gatos);
		Collections.sort(gatos);
		
		
	}

}
