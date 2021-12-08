programa
{
      /*Programa: Resolução exercicio triangulo
       Autor: Glaucya
       Data: 01/12/2021
       */
	
	funcao inicio()
	{
		inteiro base, altura, area

		escreva("insira o valor de base: ")
		leia(base)
		
		escreva("insira o valor de altura: ")
		leia(altura)
		
		area=(base*altura)/2

		se( base <0 e altura <0)
		escreva(" A área do triangulo é: ", area)

		senao
		escreva("Favor inserir um valor Positivo")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */