package br.com.generation.condicional;

import java.util.Scanner;

public class ExercicioParOuImpar {
	
	public static void main(String[] args) {
		
		 int numero = 0; 
		 double raiz, elevado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== Descubra se o n�mero � par ou impar ===");
		
		System.out.println("\nDigite um n�mero");
		numero = input.nextInt();
		
		elevado = (numero * numero);
		raiz = Math.sqrt(numero);
		if(numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par e sua raiz quadrada � " + raiz);
			
		}
		else {
			System.out.println("O n�mero " + numero + " � impar e seu valor elevado ao quadrado � " + elevado);
		}
		input.close();
	}

}
