programa
{
	/*Programa: Resolução exercicio dados 
	Autor: Glaucya
	Data: 06/12/2021
	*/
	
	funcao inicio()
	{
		inteiro jogadas [10], d, contador = 0, maiorValor = 0
		real soma = 0.0, mediaJogadas = 0.0

		para(d = 0; d < 10; d++){ 
		escreva("Digite o número correspondente a jogada ", d+1, ": " )
		leia(jogadas[d])

		    }
		    escreva("\nOs números do dado foram: ")
		    
		 para(d = 0; d < 10; d++){
		     escreva(jogadas[d], ",")
		     soma += jogadas[d]
		     mediaJogadas = soma / 10

		     se(maiorValor < jogadas[d]){
		     	maiorValor = jogadas[d]
		     }
		    
		}
		 para (d = 0; d < 10; d++) {
			se (maiorValor == jogadas[d]) {
				contador++
			}
		}
		escreva ("\nA média dos dados é: " + mediaJogadas)
		escreva ("\nA maior pontuação " + maiorValor + " aparece " + contador + " vezes.")
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */