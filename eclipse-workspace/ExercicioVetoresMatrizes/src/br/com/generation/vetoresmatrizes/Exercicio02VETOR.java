package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio02VETOR {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] jogadas = new int[10];
		int cont = 0, maiorPont = 0, soma = 0;
		double media = 0.0;
		
		for( int d = 0; d < jogadas.length; d++) {
			System.out.println("Digite o número correspondente a jogada " + (d+1) + ":");
			jogadas[d] = input.nextInt();
			soma +=  + jogadas[d];
			media = soma / 10;
			
			
			if(maiorPont < jogadas[d]) {
			     maiorPont = jogadas[d];
			}
			
			if(jogadas[d] == maiorPont) {
				cont++;
			}
			
		}
		System.out.println("O maior número lançado foi: "+ maiorPont);
		
		System.out.println("Ele apreceu " + cont + " vezes");
		
		System.out.println("O media aritmética dos dados é: " + media);
		input.close();
	    }
}
