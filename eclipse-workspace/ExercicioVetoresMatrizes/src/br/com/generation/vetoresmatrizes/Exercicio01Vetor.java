package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio01Vetor {
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double [] pontuaçao = new double[5];
		double maiorPontuaçao = 0;
		
		for(int i = 0; i < pontuaçao.length; i++) {
			System.out.println("Digite a pontuação da atividade " + (i+1) );
			pontuaçao[i] = input.nextDouble();
			
			if(pontuaçao[i] > maiorPontuaçao) {
				maiorPontuaçao = pontuaçao[i];
			}
		}
		
		System.out.println("A maior pontuação é: " + maiorPontuaçao);
		input.close();
		
        }

}
