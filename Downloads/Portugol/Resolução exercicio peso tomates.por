programa
{
	/*Programa: Resolução exercicio peso tomate
	Autor: Glaucya
	Data: 01/12/2021
	 */
	 
	funcao inicio()
	{
	
     inteiro P = 0, E = 0, pesoLimite = 50
     real M, valorMulta = 4.00
   
     escreva("Digite quantos kgs de tomate João trouxe: ")
     leia(P)

     se (P>pesoLimite){
     	E = (P - pesoLimite)
     	M = E * valorMulta
     	escreva("Peso em excesso: ", E, "\n")
     	escreva(" Valor da Multa: R$", M)
     	
     	
     }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */