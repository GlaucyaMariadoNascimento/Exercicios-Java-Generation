package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio04Matriz {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double [][] matriz = new double [3] [3];
		double soma = 0,  somaDiagonal = 0 ;
		int l, c;
		                    
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				
				System.out.println("Digite os valores da matriz: ");
				matriz [l][c] = input.nextDouble();
				
				soma += matriz [l][c];
			}
		}
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				
				somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		    }
    	}
		
		System.out.println("A soma dos valores da matriz é " + soma );
		System.out.println("A soma da diagonal principal é " + somaDiagonal );
		
	}
}
