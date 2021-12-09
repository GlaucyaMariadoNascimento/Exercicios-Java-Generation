package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicioidadealunos {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== Descubra a sua categoria === ");
		
		System.out.println("\nDigite a sua idade: ");
		idade = input.nextInt();
		
		if (idade >= 10 && idade <14) { 
		    System.out.println("Você é da categoria: Infantil ");
		}
		    
		else if (idade >= 15 && idade <17) {
		    System.out.println("Você é da categoria: Juvenil ");
		    }
		
		 else if (idade >= 18 && idade<25 ){
		    System.out.println("Você é da categoria: Adulto ");
		    
		}
		
		 else {
			 System.out.println("Idade invalida!");
		 }
		input.close();
		
	  }
   }
