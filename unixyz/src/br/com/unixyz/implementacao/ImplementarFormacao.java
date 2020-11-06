package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Bacharelado;
import br.com.unixyz.modelo.Formacao;
import br.com.unixyz.modelo.Medio;
import br.com.unixyz.modelo.Tecnologo;
import br.com.unixyz.util.Magica;

public class ImplementarFormacao {

	public static void main(String[] args) {

		Formacao formacao = null;
		char resposta = Magica.s("Digite \n<T> Tecnologo \n<B> Bacharelado").charAt(0);
		if (resposta=='T') {
			formacao = new Tecnologo(
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.f("Mensalidade"),
					true
					);
		}else if (resposta=='B') {
			formacao = new Bacharelado(
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.f("Mensalidade"),
					Magica.i("Carga Horaria Estagio"),
					Magica.s("TCC")
					);
		}else {
			formacao = new Medio(
					Magica.s("Descricao"),
					Magica.i("Duracao"),
					Magica.f("Mensalidade"),
					Magica.s("Tipo")
					);
		}

		formacao.calcMensalidade(0.0005);
		System.out.println(formacao.getAll());
		System.out.println(formacao.retornarMedia(5, 7, 4, 10));


	}//fecha main

}//fechaclass
