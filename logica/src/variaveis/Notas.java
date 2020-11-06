package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		//Input=> nome, disciplina, duas notas. 
		//Exibir o nome do aluno, a média e a disciplina.


		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float media = (nota1 +nota2)/2;


		System.out.println("Nome do aluno...........: " + nome);
		System.out.println("Disciplina .............: " + (disciplina));
		System.out.println("Média das notas.........: " + media);


	}
	
}

