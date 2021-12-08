programa{
	
	/*Programa: Resolução exercicio números positivos
	 Autor: Glaucya
	 Data: 02/12/2021
	 */
	funcao inicio(){

		real valor, somaValor = 0.0, mediaValor
		inteiro contador = 0

		escreva("Leia o valor: " )
		leia(valor)

		enquanto(valor >0){
			somaValor += + valor
			contador++
			escreva("Digite um valor: ")
			leia(valor)
		}
		mediaValor = somaValor /contador 

		escreva("\nSomatório de Valores: " + somaValor)
		escreva("\nMédia de Valores: " + mediaValor)
		escreva("\nQuantidade de Valores Lidos: " + contador)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */