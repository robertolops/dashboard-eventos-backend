package listaum;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		/*Sua equipe est� desenvolvendo um sistema de desenho e coube a voc� a tarefa de desenvolver programas para calcular:
		 * a �rea das seguintes figuras geom�tricas:
		 *I. Ret�ngulo (base x altura)
		 *II. C�rculo (PI x Raio2)
		 */

		float base = Float.parseFloat(JOptionPane.showInputDialog("Base"));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"));
		float raio = Float.parseFloat(JOptionPane.showInputDialog("Raio"));
		double pi = 3.14;


		System.out.println("�rea do Retangulo: " + (base*altura));
		System.out.println("�rea do Circulo..: " + (pi*raio*raio));


	}

}
