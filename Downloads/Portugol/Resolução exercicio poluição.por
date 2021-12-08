programa
{
	/*Programa: Resolução exercicio poluição
	Autor: Glaucya
	Data: 01/12/2021
	*/
	
	funcao inicio()
	{
       real industria

       escreva("Digite um indice de poluição: ")
       leia(industria)

       se(industria >= 0.05 e industria <=0.25)
       escreva("Indice dentro dos padroes aceitaveis")
       
       senao
       se(industria >= 0.3){
       escreva("As industrias do 1º grupo paralizam as atividades ")
       }
       senao
       se(industria >= 0.4){
       escreva("As industrias do 1º e do 2º grupo paralizam as atividades")
       }
       senao
       	se(industria >= 0.5){
       escreva("As industrias dos tres grupos paralizam as atividades")}
       
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */