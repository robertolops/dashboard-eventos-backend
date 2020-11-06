package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarVenda {

	public static void main(String[] args) {

		Venda venda = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.f("Total"),
				Magica.f("Desconto"),
				Magica.s("Data"),
				new Cliente(
						Magica.i("ID"),
						Magica.s("Nome"),
						Magica.s("Fone"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Numero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("CEP")		
								)
						),
				new Produto(
						Magica.i("ID"),
						Magica.s("Descrição"),
						Magica.f("Valor de Venda"),
						Magica.f("Valor de Compra"),
						Magica.i("Quantidade")
						)
				);


		System.out.println(venda.getAll());

	}//fecha main

}//fecha class
