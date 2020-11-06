package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;


public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descrição").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria"))
				);

		System.out.println(curso.getAll());

	}

}