package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		//Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os
		//A taxa de servi�os � de: 
		//R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15;
		//R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15;
		//R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		//Monte uma aplica��o que apresente a conta do cliente.

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de di�rias"));

		if(qtde>15) {
			double diaria = (qtde*85.5);
			System.out.println("Valor total da conta em R$: " + diaria);
		}else if(qtde==15) {
			double diaria = (qtde*86);
			System.out.println("Valor total da conta em R$: " + diaria);
		}else {
			double diaria = (qtde*88);
			System.out.println("Valor total da conta em R$: " + diaria);
		}

	}//fecha main		
}//fecha class

