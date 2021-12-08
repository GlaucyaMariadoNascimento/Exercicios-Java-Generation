programa
{
     /*Programa: Resolução exercicio quadrado
      Autor: Glaucya
      Data: 01/12/2021
      */
	
	funcao inicio()
	{
		real n1, n2, n3, n4
		real q1, q2, q3, q4

          escreva("Inserir número 1: ")
		leia(n1)
		
		escreva("Inserir número 2: ")
		leia(n2)
		
		escreva("Inserir número 3: ")
		leia(n3)
		
		escreva("Inserir número 4: ")
		leia(n4)

		q1=n1*n1
		q2=n2*n2
		q3=n3*n3
		q4=n4*n4

	     se (q3 >=1000){ 
		escreva("O quadrado de ", n3,  " é igual: ", q3)
		}
		senao{ 
          escreva("O quadrado de ", n1, " é igual: ", q1)
          
          escreva("O quadrado de ", n2, " é igual: ", q2)
          
          escreva("O quadrado de ", n3, " é igual: ", q3)
          
          escreva("O quadrado de ", n4, " é igual: ", q4)
          }
       

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */