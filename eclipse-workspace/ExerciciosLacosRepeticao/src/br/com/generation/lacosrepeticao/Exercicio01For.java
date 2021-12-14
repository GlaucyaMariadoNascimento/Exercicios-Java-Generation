package br.com.generation.lacosrepeticao;

public class Exercicio01For {
	public static void main(String[] args) {
		
		System.out.println("Os números entre 1000 e 1999 que divididos por 11 obtem o resto igual a 5 são;");
		
		int i;
		
		
		for ( i = 1000; i  < 1999; i++) {
			if (i %11 ==5) {
				
				System.out.println(i);
				
			}
		}
		
	}

}
