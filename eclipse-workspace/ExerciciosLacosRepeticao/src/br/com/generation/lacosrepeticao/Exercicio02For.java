package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int num,  i, par = 0, impar = 0; 
			
			
			for (i = 1; i <= 10; i++ ) {
				System.out.println("Digite o " + i + " � n�mero: ");
				num = input.nextInt();
				
				if ( num % 2 == 0) {
					par++;
					
				 }
				
				if ( num % 2 == 1) {
					impar++;
				
				}
			}

				System.out.println("Foram digitados " + par + " n�meros pares e " + impar + " n�meros �mpares.");
				
				
		
		}
	
     }

   }
	
	  
	


