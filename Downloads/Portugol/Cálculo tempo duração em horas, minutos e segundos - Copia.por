programa 
{
	
	/*Programa: Exercicio Duração de um evento em segundos
	 * Autor: Glaucya
	 * Data 29/11/2021
	 */
	funcao inicio()
	{
	    inteiro temposegundos

	    inteiro horas 

	    inteiro minutos 

	    inteiro segundos

	    inteiro restodivisaohoras

	    escreva("Digite a duração do evento em segundos: ")
	    leia(temposegundos)

	    horas = temposegundos/3600

	    restodivisaohoras = temposegundos%3600

	    minutos = restodivisaohoras/60

	    segundos = restodivisaohoras%60

	    escreva("Segundos equivalem a Horas: " + horas)
	    escreva("\tMinutos" + minutos)
	    escreva("\tSegundos" + segundos)
	    
	    

	    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */