programa{
	  
	/*Programa: Resolução exercicio multiplos 3 até 500
	  Autor: Glaucya	
	  Data: 02/12/2021
	 */
	 
	funcao inicio(){
	
		inteiro  i, s = 0
		

		para(i=1; i <500; i++){
		
		se(i % 2 ==1 e i % 3 == 0)
		s = s+i
		}
		
		escreva("A soma dos números impares multiplos de 3 é:  " + s)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */