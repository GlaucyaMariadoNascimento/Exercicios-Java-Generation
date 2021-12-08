package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioPontos {
	
	public static void main(String[] args) {
		
		double x1, x2, y1, y2;
		double d, p1, p2;
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a nota 1: ");
			x1 = input.nextDouble();
			
			System.out.println("Digite a nota 1: ");
			x2 = input.nextDouble();
			
			System.out.println("Digite a nota 1: ");
			y1 = input.nextDouble();
			
			System.out.println("Digite a nota 1: ");
			y2 = input.nextDouble();
		}
		
		p1 = Math.pow((x1 - x2), 2);
		p2 = Math.pow((y1 - y2), 2);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distancia entre os dois pontos é: " + d);
		
			
	}

}
