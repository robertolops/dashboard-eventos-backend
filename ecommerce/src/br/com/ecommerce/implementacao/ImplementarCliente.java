package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		int resposta = Magica.i("Digite <1> PF ou Digite <2) PJ");
		if (resposta==1) {
			c = new PessoaFisica(
					1,
					"Maria",
					"1234-5679",
					new Endereco(),
					"123.456.789-xx",
					"00.000.000-xx"	
					); 
		} else if (resposta==2) {
			c = new PessoaJuridica(
					2,
					"Padaria LTDA",
					"7890-1234",
					new Endereco(),
					"123.456.789/0001-xx",
					"00.000.000.000",
					"Sra Mariazinha"
					);
		}

		System.out.println(c.getAll());

	}//fecha main

}//fecha class
