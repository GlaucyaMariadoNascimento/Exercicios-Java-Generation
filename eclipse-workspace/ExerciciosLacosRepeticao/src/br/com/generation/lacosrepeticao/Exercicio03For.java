package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Exercicio03For {
	public static void main(String[] args) {
		
		
		int idade = 0, cont21 = 0, cont50 = 0;
		
		Scanner input = new Scanner(System.in);
		

		
		while (idade != -99) {
			System.out.print("Digite a idade da pessoa pesquisada:");
			idade = input.nextInt();
			
			
			if(idade < 21 && idade >= 0) {
				cont21++;
			}
			else if(idade > 50) { 
				cont50++;
			
		System.out.println("O total de pessoas com menos de 21 anos é: " + cont21);
		
		System.out.println("O total de pessoas com mais de 50 anos é: " + cont50);
		input.close();
		 }
	 }
  }
}
		


