//FLUXO CONDICIONAL
//Utilização do IF, ELSE
	
public class ControleFluxo2 {
	/*Método principal da classe*/
	public static void main (String [] args) {
		
		int numero = 8; //define o valor da variável em 8
		if ((numero % 2) == 0) { //verifica se o resto da divisão é igual a 0
			System.out.println ("Este é um número par"); //Imprima em tela a mensagem
			else {
				System.out.println ("Esse é um número impar"); //Imprima em tela a mensagem
			}
		}//fim do método
	}//fim do método
}//fim da classe


/**
O else, significa que, caso o bloco seja falso, executará o comando else.
Isto é, se o valor da variável, assim como o resto da divisão, for igual a zero, então o
número (definido na variável) será par. Do contrário, será exibida a mensagem “este
número é ímpar”.
**/