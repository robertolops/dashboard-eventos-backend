package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade (M�dio, Superior ou P�s)
		 * enquanto a resposta for v�lida, ir� computando os totais dos n�veis digitados,
		 * no final apresente somente o n�vel que foi mais votado
		 */

		String escolaridade="";
		int medio=0;
		int superior=0;
		int pos=0;

		do {
			escolaridade=JOptionPane.showInputDialog("Digite sua escolaridade: M�dio, Superior ou Pos").toUpperCase();
			if(escolaridade.equals("MEDIO")) {
				medio=medio+1;
			}else if (escolaridade.equals("SUPERIOR")) {
				superior=superior+1;
			}else if (escolaridade.equals("POS"))
				pos=pos+1;		     
		}while(escolaridade.equals("MEDIO") || escolaridade.equals("SUPERIOR")|| escolaridade.equals("POS"));  

		System.out.println("Nivel de escolaridade M�dio: " + medio);
		System.out.println("Nivel de escolaridade Superior: " + superior);
		System.out.println("Nivel de escolaridade Pos Gradua��o: " + pos);

	}
}

