package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio03Matrizes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [][] n1 = new int[4][6]; int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6]; int[][] m2 = new int[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				
				System.out.println("Digite os valores de N1: " );
				n1 [l][c]= input.nextInt();
				
				System.out.println("Digite os valores de N2: " );
				n2 [l][c]= input.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
				
		System.out.println("\n" + "A soma da matriz M1: ");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				
				
				System.out.print(m1[l][c] + " ¦ ");
			}
		}
		System.out.println("\n" + "A diferença da matriz M2: ");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				
				System.out.print(m2[l][c] + " ¦ ");
				input.close();
			}
			
		}

	}

}
