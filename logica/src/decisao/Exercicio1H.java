package decisao;

import javax.swing.JOptionPane;

public class Exercicio1H {

	public static void main(String[] args) {

		//Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços
		//A taxa de serviços é de: 
		//R$ 5,50 por diária, se o número de diárias for maior que 15;
		//R$ 6,00 por diária, se o número de diárias for igual a 15;
		//R$ 8,00 por diária, se o número de diárias for menor que 15.
		//Monte uma aplicação que apresente a conta do cliente.

		short qtdeDiarias = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de diárias"));
		double valorDiaria=0; 

		if(qtdeDiarias>15) {
			valorDiaria=85.5;
		}else if(qtdeDiarias==15) {
			valorDiaria=86;
		}else {
			valorDiaria=88;
		}
		System.out.println("Total: " + (valorDiaria*qtdeDiarias));

	}//fecha main		
}//fecha class

