package br.com.generation.condicional;

import java.util.Scanner;

public class ExercicioMaiorDeles {
	
	public static void main(String[] args) {
		
		int numero1, numero2, numero3 ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== Descubra qual o maior número ===");
		
		System.out.println("\nDigite o primeiro número: ");
		numero1= input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = input.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = input.nextInt();
		
		if((numero1 > numero2)&&(numero1 > numero3)) {
			System.out.println("O primeiro número é o maior: " + numero1);
		}
		
		else if((numero2 > numero1)&& (numero2 > numero3)) {
			System.out.println("O segundo número é o maior: " +  numero2 );
		}
		
		else if((numero3 > numero1)&& (numero3 > numero2)) {
			System.out.println("O terceiro número é o maior: " + numero3);
		}
		
		else {
			System.out.println("Os três números são iguais ");
		}
		
		input.close();
		
	}

}
