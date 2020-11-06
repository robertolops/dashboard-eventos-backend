package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {

		//Crie as vari�veis para armazenar: nome do produto, codigo, valor e quantidade
		//exiba o nome final do produto, o total e o total com 10% de desconto

		/*
		 * Parse => convers�o entre tipos incompat�veis (String => primitivo)
		 * 
		 * Primitivo => s�o os tipos que fazem parte da linguagem (come�am com letras minusculas)
		 * boolean => armazena True ou False
		 * char => armazena um caracter
		 * byte => numeros inteiros (-127 // +128)
		 * short => numeros inteiros (-32K // +32K)
		 * int => numeros inteiros (-2 bilhoes // + 2bilhoes)
		 * long => numeros inteiros
		 * float => numeros reais
		 * double => numeros reais (dobro de precis�o nas casas decimais)
		 * 
		 * Classe Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 * float => Float
		 * boolean => Boolean
		 * atalho pra system.out (sysout CTR Space)
		 */

		String produto = JOptionPane.showInputDialog("Digite o nome do produto");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")); 
		double total = quantidade*valor;


		System.out.println("Produto...........: " + produto);
		System.out.println("Total.............: " + (total));
		System.out.println("Total com desconto: " + (total*0.9));

	}
	
}
