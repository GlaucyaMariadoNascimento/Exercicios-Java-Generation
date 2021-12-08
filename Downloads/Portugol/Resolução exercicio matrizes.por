programa
{
	/*Programa: Resolução exercicio matrizes 
	Autor: Glaucya 
	Data: 06/12/2021
	*/
	
	funcao inicio(){

	  inteiro l, c, soma = 0, somaDiagonal
	  inteiro matriz[3][3]

	  escreva("Digite os valores da matriz: ")

	  para(l = 0; l <3; l++){
	  para(c = 0; c <3; c++){

	  	leia(matriz [l][c])
	  	soma += matriz[l][c]
	  }
	  
    }
	  	escreva("\n")
		
		para(l = 0; l < 3; l++){
			para(c = 0; c < 3; c++){
				escreva(matriz[l][c], ",")
			}
			escreva("\n")
		}
		escreva("A soma dos valores da matriz é: ", soma)

		 somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]
		 escreva("5\nA soma da diagonal principal é: ", somaDiagonal)
	  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */