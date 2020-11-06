package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		/*Um jogo de advinhação
		 *O jogador 1 digita um numero inteiro
		 *O jogador 2 tem que advinhar o numero digitado pelo jogador 1
		 *Enquanto ele não acertar o jogo continua perguntando o numero
		 *
		 *Etapa2
		 *Acrescente a contagem de tentativas do jogador 2
		 *Apresente quantas tentativas ele usou para acertar o numero
		 *
		 *Etapa3
		 *Acrescente dicas para para o jogador 2 , indicando se o numero 
		 *que ele esta tentando advinhar é maior ou menor que ele chutou
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número a ser advinhado"));
		int chute = 0;
		int contador=0;

		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número"));
			contador=contador+1;         //ou contador++ ou contador+=1
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O número é maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O número é menor");
			}
		}while(numero!=chute);

		System.out.println("Parabéns você acertou com " + contador + " tentativa(s).");;

	}
}
