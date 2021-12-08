programa{
	/*Programa: Resolução exercicio número maior de cinco
	Autor: Glaucya
	Data 06/12/2021
	*/
	funcao inicio(){
	   
	  	inteiro vetor[5], maior, i

	  	para(i = 0; i < 5; i++){
	  		escreva("\ninforme o ",i+1, "º valor: ")
	  		leia(vetor[i])
	  	}
	  	maior = vetor[0]

	  	para(i = 0; i < 5; i++){
	          se(maior < vetor[i]){
	           maior = vetor[i]
	          }
	          escreva("\nMaior  é: " + maior)
	  		
	  	}
	  
	   
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */