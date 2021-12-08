package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioMediaAluno {
	
	public static void main(String[] args) {
   
		double nota1, nota2, nota3, media;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a nota 1: ");
			nota1 = input.nextInt();
		
	   
	    System.out.println("Digite a nota 2: ");
	    nota2 = input.nextDouble();
	    
	    System.out.println("Digite a nota 3:");
	    nota3 = input.nextDouble();
		}
		
	    media = (nota1*2 + nota2*3 + nota3*5)/10;
	    
	    System.out.println("A média é " + media);
	    
	    
	    
			
			
		
		
    }
	
}
