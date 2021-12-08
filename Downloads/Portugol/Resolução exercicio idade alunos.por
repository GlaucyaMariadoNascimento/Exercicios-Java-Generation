programa
{
     /*Programa: Resolução exercicio idade alunos
      Autor: Glaucya
      Data: 01/12/2021
      */
	
	funcao inicio()
	{
	
	inteiro idade

	escreva("Digite a idade do aluno: ")
	leia(idade)

	se (idade >= 5 e idade <= 7)
	     escreva("A categoria é: Infantil A")
	     
	senao se(idade >= 8 e idade <= 10){
		escreva("A categoria é Infantil B")}

     senao se(idade >= 11 e idade <= 13){
     	escreva("A categoria é: Juvenil A")}

     senao se(idade >= 14 e idade <= 17){
     	escreva("A categoria é: Juvenil B")}

     senao se(idade >= 18){
     	escreva("A categoria é: Adulto")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */