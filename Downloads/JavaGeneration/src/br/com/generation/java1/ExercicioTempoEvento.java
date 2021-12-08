package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioTempoEvento {
	
	public static void main(String[] args) {
		
		int minutos, segundos, horas, seg;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite a dura��o do evento em segundos: ");
			segundos = input.nextInt();
		}
		
		horas = segundos / 3600;
		
		minutos = ((segundos % 3600)/ 60);
		
		seg = ((segundos % 3600)% 60);
		
		
		System.out.println("A dura��o do evento foi de " + horas +" horas " + minutos + " minutos e " + seg + " segundos");
		
		
	}
	

}
