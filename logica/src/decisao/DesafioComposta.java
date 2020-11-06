package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {

		// Peça a entrada de Veiculo, capacidade de Passageiros
		// Exiba a mensagem:
		// "Veiculo Categoria A", se a qtde passageiros for igual a 2
		// "Veiculo Categoria B", se a qtde de passageiros estiver entre 4 e 7
		// "Veiculo Categoria C", se a qtde de passageiros for maior que 7


		String veiculo = JOptionPane.showInputDialog("Tipo de veículo").toUpperCase();
		byte capacidade = Byte.parseByte(JOptionPane.showInputDialog("Capacidade de Passageiros"));

		if (capacidade==2) {
			System.out.println(veiculo + " Categoria A");
		}else if(capacidade>7) {
			System.out.println(veiculo + " Categoria C");
		}else if(capacidade>=4 ) {
			System.out.println(veiculo + " Categoria B");
		}else {
			System.out.println("Categoria desconhecida");
		}

	}//fecha main
}//fecha class

