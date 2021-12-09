package br.com.generation.condicional;

import java.util.Scanner;

public class ExercicioParOuImpar {
	
	public static void main(String[] args) {
		
		 int numero = 0; 
		 double raiz, elevado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== Descubra se o número é par ou impar ===");
		
		System.out.println("\nDigite um número");
		numero = input.nextInt();
		
		elevado = (numero * numero);
		raiz = Math.sqrt(numero);
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par e sua raiz quadrada é " + raiz);
			
		}
		else {
			System.out.println("O número " + numero + " é impar e seu valor elevado ao quadrado é " + elevado);
		}
		input.close();
	}

}
