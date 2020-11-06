package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Crie um programa que pergunte ao usuário o seu nível de escolaridade (Médio, Superior ou Pós)
		 * enquanto a resposta for válida, irá computando os totais dos níveis digitados,
		 * no final apresente somente o nível que foi mais votado
		 */

		String escolaridade="";
		int medio=0;
		int superior=0;
		int pos=0;

		do {
			escolaridade=JOptionPane.showInputDialog("Digite sua escolaridade: Médio, Superior ou Pos").toUpperCase();
			if(escolaridade.equals("MEDIO")) {
				medio=medio+1;
			}else if (escolaridade.equals("SUPERIOR")) {
				superior=superior+1;
			}else if (escolaridade.equals("POS"))
				pos=pos+1;		     
		}while(escolaridade.equals("MEDIO") || escolaridade.equals("SUPERIOR")|| escolaridade.equals("POS"));  

		System.out.println("Nivel de escolaridade Médio: " + medio);
		System.out.println("Nivel de escolaridade Superior: " + superior);
		System.out.println("Nivel de escolaridade Pos Graduação: " + pos);

	}
}

