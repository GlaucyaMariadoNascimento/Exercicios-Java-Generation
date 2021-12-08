package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioCalculoExpressão {

	public static void main(String[] args) {
		
		double R, S, D;
		double a, b, c;
	
	
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite o primeito número: ");
			a = input.nextInt();
			
			System.out.println("Digite o segundo número: ");
			b = input.nextInt();
			
			System.out.println("Digite o terceiro número: ");
			c = input.nextInt();
		}   
		  R = Math.pow((a + b), 2);
		  S = Math.pow((b + c), 2);
		  D = (R+S)/ 2;
		    
		    System.out.println("O resultado do cálculo é "+ D);
		    
		    
		    
	}
}
