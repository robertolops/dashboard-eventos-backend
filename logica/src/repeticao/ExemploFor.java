package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		//For: utlizamos normalmente quando n�o ha intera��o do usu�rio com a repeti��o
		//Sintaxe:
		//1� Parametro: inicio da repeti��o com a defini��o do contador
		//2� Parametro: condi��o, ou, seja, at� quando o la�o vai ser executado
		//3� Parametro: qual a forma de contagem
		
		int tabuada=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		
		for (int contador=0;contador<=10;contador++) { //+2 conta de dois em dois, se quiser numeros impares contador=1
			System.out.println(tabuada + "X" + contador + "=" + (tabuada * contador));
		}

	}//fecha  main
}//fecha class
