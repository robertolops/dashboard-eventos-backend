package listaum;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		/*Sua equipe está desenvolvendo um sistema de desenho e coube a você a tarefa de desenvolver programas para calcular:
		 * a área das seguintes figuras geométricas:
		 *I. Retângulo (base x altura)
		 *II. Círculo (PI x Raio2)
		 */

		float base = Float.parseFloat(JOptionPane.showInputDialog("Base"));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"));
		float raio = Float.parseFloat(JOptionPane.showInputDialog("Raio"));
		double pi = 3.14;


		System.out.println("Àrea do Retangulo: " + (base*altura));
		System.out.println("Àrea do Circulo..: " + (pi*raio*raio));


	}

}
