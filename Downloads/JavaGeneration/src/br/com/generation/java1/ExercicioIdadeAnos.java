package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioIdadeAnos {
	public static void main(String[] args) {
		
		int anos, meses, dia, dias;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de dias: ");
			dias = input.nextInt();}
		
		anos = dias/365;
		meses =(dias % 365)/30;
		dia = (dias % 365) % 30;
		
		System.out.println("A idade de é " + anos + " anos " + meses + " meses " + dia + " dias");
		
		
		
				
				
		
	    
		
	}
}
