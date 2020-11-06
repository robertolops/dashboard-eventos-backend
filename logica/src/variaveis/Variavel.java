package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * Tipos de Dados
		 * Alfanumérico(String): é o dado que NÃO pode ser utilizado em operações aritméticas 
		 * CEP 00010-009 (se fosse numerico entenderia o hifen como subtração)
		 * Numérico: é o dado que pode ser utilizado em operações aritméticas e/ou ele é dado de chave de busca dentro da aplicação
		 * CEP (dentro de um contexto das aplicações do Correio)
		 * dois tipos de numérico: int (para números inteiros) e double (para números reais, com casas decimais)
		 */

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);

		//pode usar o print acrescentando "\n" para quebrar linhas ou println (para uma quebra de linha)
		System.out.println("Usuário: " + nome);
		System.out.println("Idade..: " + idade);

		// %f =>numeros reais /// %s Strings /// %d inteiros 
		System.out.printf("IMC....: %.2f\n" , imc);	


		//System.out.printf("Sr(a) %s, você tem %d anos de idade. Seu IMC é %.2f\n", nome, idade, imc);

	}

}
