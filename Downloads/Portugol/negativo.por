programa
{
	/*Programa: Resolução exercicio positivo/negativo
	Autor: Glaucya
	Data: 01/12/2021
	*/
	
	funcao inicio()
	{
	inteiro numero

	escreva("Informe um número: ")
	leia(numero)

	 se(numero % 2 == 0)
	 escreva("O número: ", numero, "\té par")
	 
	 senao 
	 escreva("O número: ", numero, "\té impar")

	se(numero >=0)
	 escreva("O número: ", numero, "\té positivo")

	 senao 
	 escreva("O número: ", numero, "\té negativo")

	
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */