package desafio2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		int x, y, pts, ptsTot = 0;
		for(int i = 0; i < 10; i++ ) {
			System.out.println("Digite o placar do time x: ");
			x = entrada1.nextInt();
			System.out.println("Digite o Plcar do outro time: ");
			y = entrada1.nextInt();
			if (x>y) {
				pts = 3;
				ptsTot = ptsTot + pts;
		
			}else if(x == y){
				pts = 1;
				ptsTot = ptsTot + pts;
				
			}else {
				pts = 0;
				
			}	
			
		}
		System.out.println("Foi um total de " + ptsTot + " ponto(s)" );

	}

}
