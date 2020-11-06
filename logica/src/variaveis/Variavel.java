package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * Tipos de Dados
		 * Alfanum�rico(String): � o dado que N�O pode ser utilizado em opera��es aritm�ticas 
		 * CEP 00010-009 (se fosse numerico entenderia o hifen como subtra��o)
		 * Num�rico: � o dado que pode ser utilizado em opera��es aritm�ticas e/ou ele � dado de chave de busca dentro da aplica��o
		 * CEP (dentro de um contexto das aplica��es do Correio)
		 * dois tipos de num�rico: int (para n�meros inteiros) e double (para n�meros reais, com casas decimais)
		 */

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);

		//pode usar o print acrescentando "\n" para quebrar linhas ou println (para uma quebra de linha)
		System.out.println("Usu�rio: " + nome);
		System.out.println("Idade..: " + idade);

		// %f =>numeros reais /// %s Strings /// %d inteiros 
		System.out.printf("IMC....: %.2f\n" , imc);	


		//System.out.printf("Sr(a) %s, voc� tem %d anos de idade. Seu IMC � %.2f\n", nome, idade, imc);

	}

}
