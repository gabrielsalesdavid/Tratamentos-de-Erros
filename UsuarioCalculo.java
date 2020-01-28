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
		System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1/num2);
	} catch (ArithmeticException e) {
		System.out.println("Não é possivel dividie " + num1 + " por " + num2 );
	} finally {
		System.out.println("Faça isto tambem! ");
	}
	
	teclado.close();
	}
}
