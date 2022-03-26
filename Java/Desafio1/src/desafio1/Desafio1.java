package desafio1;
import java.util.Scanner;
public class Desafio1 {

	public static void main(String[] args) {
		double ano;
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		ano = entrada1.nextDouble();
		
		if (ano > 0) {
		System.out.println("O século é: " + (int)Math.ceil(ano/100));
	}else{
		System.out.println("Ano inválido");
	}

	}
}