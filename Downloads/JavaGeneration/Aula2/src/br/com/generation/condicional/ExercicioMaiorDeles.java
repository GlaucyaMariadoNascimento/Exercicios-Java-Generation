package br.com.generation.condicional;

import java.util.Scanner;

public class ExercicioMaiorDeles {
	
	public static void main(String[] args) {
		
		int numero1, numero2, numero3 ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== Descubra qual o maior n�mero ===");
		
		System.out.println("\nDigite o primeiro n�mero: ");
		numero1= input.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = input.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = input.nextInt();
		
		if((numero1 > numero2)&&(numero1 > numero3)) {
			System.out.println("O primeiro n�mero � o maior: " + numero1);
		}
		
		else if((numero2 > numero1)&& (numero2 > numero3)) {
			System.out.println("O segundo n�mero � o maior: " +  numero2 );
		}
		
		else if((numero3 > numero1)&& (numero3 > numero2)) {
			System.out.println("O terceiro n�mero � o maior: " + numero3);
		}
		
		else {
			System.out.println("Os tr�s n�meros s�o iguais ");
		}
		
		input.close();
		
	}

}
