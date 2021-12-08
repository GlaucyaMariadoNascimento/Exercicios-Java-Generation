package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioIdadeDias {
	
	public static void main(String[] args) {
		
		int anos, meses, dias, quantidadeDias;
		try (Scanner leia = new Scanner(System.in)) {
			
			System.out.print("Quantidade de anos: ");
			anos = Integer.parseInt(leia.nextLine());
			 
   
			System.out.print("Quantidade de meses: ");
			meses = Integer.parseInt(leia.nextLine());
			 
  
			System.out.print("Quantidade de dias: ");
			dias = Integer.parseInt(leia.nextLine());
			 

			quantidadeDias = (anos * 365) + (meses * 30) + dias;
			 

			System.out.println("Idade em dias: " + quantidadeDias);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
