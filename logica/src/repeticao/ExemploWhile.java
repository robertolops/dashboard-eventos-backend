package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.indexOf("@")==-1) {
			email = JOptionPane.showInputDialog("Email deve ter @").toLowerCase();
		}
		System.out.println(email);

		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		while (nome.length()<5 || nome.length()>20) {
			nome = JOptionPane.showInputDialog("Digite um nome entre 5 e 20").toUpperCase();
		}

		System.out.println(nome);

	}//fecha main

}//fecha class
