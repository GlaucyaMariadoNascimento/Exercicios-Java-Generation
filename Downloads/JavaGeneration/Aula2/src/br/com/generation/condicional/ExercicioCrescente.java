package br.com.generation.condicional;

import java.util.Scanner;

public class ExercicioCrescente {
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("== Descobrindo a ordem crescente ==");
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = input.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = input.nextInt();
		
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.println("A ordem crescente é " + num1 + num2 + num3);
		}
		
		else if(num1 <= num3 && num3 <= num2) {
				System.out.println("A ordem crescente é " + num1 + num3 + num2);
			}
		
		else if(num2 <= num1 && num1 <= num3) {
				System.out.println("A ordem crescente é " + num2 + num1 + num3);
			}
		
		else if(num2 <= num3 && num3 <= num1) {
			System.out.println("A ordem crescente é " + num2 + num3 + num1);
		}
		
		else if(num3 <= num1 && num1 <= num2) {
			System.out.println("A ordem crescente é " + num3 + num1 + num2);
		}
		
		else {
			System.out.println("A ordem crescente é " + num3 + num1 + num2);
		}
		
		input.close();
	}
}


