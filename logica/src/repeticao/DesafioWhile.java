package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		/*
		 * Solicitar dia, mes e ano, em variáveis separadas
		 * valide se o ano está entre 1950 e 2002
		 * valide se o mes está entre 1 e 12
		 * valide se o dia está entre 1 e 30 (para alguns meses) ou
		 * entre 1 e 31 para outros meses
		 * No final exibe a data completa
		 */

		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));

		while (ano <1950 || ano>2002) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano novamente"));
		}
		while (mes<1 || mes >12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês novamente"));
		}
		if (mes==2 || mes==4 || mes==6 || mes==9 || mes==11) { // meses com  ate 30 dias
			while (dia<1 || dia >31) {
			dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}
		System.out.println(dia+"/" + mes + "/" + ano);

	}//fecha main

}//fecha class
