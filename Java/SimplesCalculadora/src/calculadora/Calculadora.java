package calculadora;

import java.util.Scanner;

public class Calculadora {

	
	
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o valor da primeira varíavel: ");
	int a = teclado.nextInt();
	System.out.println("Digite o valor da segunda varíavel: ");
	int b = teclado.nextInt();
	
	int soma = soma(a,b);
	int sub = sub(a,b);
	double div = div(a,b);
	int mult = mult(a,b);
	System.out.println("Resultados : ");
	System.out.println("Soma: " + soma);
	System.out.println("Subtracao: " + sub);
	System.out.println("Divisao: " + div);
	System.out.println("Multiplicacao: " + mult);

	}
	
	public static int soma(int a, int b) {
		return a + b;
	
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static double div(float a, float b) {
		return a / b;
	}
	
	public static int mult(int a, int b) {
		return a * b;
	}
	

}
