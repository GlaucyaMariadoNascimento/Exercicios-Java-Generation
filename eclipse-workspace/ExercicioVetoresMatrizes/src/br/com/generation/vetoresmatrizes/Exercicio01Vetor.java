package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio01Vetor {
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double [] pontua�ao = new double[5];
		double maiorPontua�ao = 0;
		
		for(int i = 0; i < pontua�ao.length; i++) {
			System.out.println("Digite a pontua��o da atividade " + (i+1) );
			pontua�ao[i] = input.nextDouble();
			
			if(pontua�ao[i] > maiorPontua�ao) {
				maiorPontua�ao = pontua�ao[i];
			}
		}
		
		System.out.println("A maior pontua��o �: " + maiorPontua�ao);
		input.close();
		
        }

}
