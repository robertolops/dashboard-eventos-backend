package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		//For: utlizamos normalmente quando não ha interação do usuário com a repetição
		//Sintaxe:
		//1º Parametro: inicio da repetição com a definição do contador
		//2º Parametro: condição, ou, seja, até quando o laço vai ser executado
		//3º Parametro: qual a forma de contagem
		
		int tabuada=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		
		for (int contador=0;contador<=10;contador++) { //+2 conta de dois em dois, se quiser numeros impares contador=1
			System.out.println(tabuada + "X" + contador + "=" + (tabuada * contador));
		}

	}//fecha  main
}//fecha class
