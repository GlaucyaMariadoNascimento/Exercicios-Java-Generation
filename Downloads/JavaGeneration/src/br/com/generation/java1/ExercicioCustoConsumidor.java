package br.com.generation.java1;

import java.util.Scanner;

public class ExercicioCustoConsumidor {
	
 public static void main(String[] agrs) {

	 
	 double custofabrica, distribuidor, custoconsumidor;
	 
	 try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe o custo de fabrica do carro: ");
			custofabrica = input.nextInt();
	 }
	 
	 distribuidor = (custofabrica*0.28) + custofabrica;
	 
	 custoconsumidor = (distribuidor*0.45) + distribuidor;
	 
	 System.out.println("O valor do carro para o consumidor é " + custoconsumidor);
	 
   }
}
