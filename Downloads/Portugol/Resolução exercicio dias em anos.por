programa
{

	/*Programa: Resolução exercicio dias em anos 
	Autor: Glaucya
	Data: 29/11/2021
	*/
	
	funcao inicio()
	{
	inteiro anos
	
	inteiro meses
	 
	inteiro dias 
	
	inteiro restodivisao
	
	inteiro idadedias

	escreva("Digite sua idade em dias: ")
	leia(idadedias)

	anos = idadedias/365

	restodivisao = idadedias%365

	meses = restodivisao/30

	dias = restodivisao%30

	escreva("Anos: " + anos)

	escreva("\tMeses: " + meses)

	escreva("\tDias: " + dias)

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */