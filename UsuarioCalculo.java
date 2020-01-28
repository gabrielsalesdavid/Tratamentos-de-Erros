package br.com.tratamentosdeerros;

import java.util.Scanner;

public class UsuarioCalculo {
	public static void main(String [] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe o primeiro numero para ser dividido: ");
	int num1 = teclado.nextInt();
	
	System.out.println("Informe o segundo numero para ser dividido com o primeiro: ");
	int num2 = teclado.nextInt();
	
	try {
		System.out.println("A divis�o de " + num1 + " por " + num2 + " � " + num1/num2);
	} catch (ArithmeticException e) {
		System.out.println("N�o � possivel dividie " + num1 + " por " + num2 );
	} finally {
		System.out.println("Fa�a isto tambem! ");
	}
	
	teclado.close();
	}
}
