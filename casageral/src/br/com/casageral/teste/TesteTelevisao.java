package br.com.casageral.teste;

import br.com.casageral.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {


		Televisao eletro = new Televisao(); //instanciar objeto
		
		eletro.preencherMarca("Sony");
		eletro.preencherValor((float)3000);	
		System.out.println(eletro.retornarMarca());
		System.out.println(eletro.retornarValor());		
		System.out.println(eletro.retornarTudo());
		eletro.ligar();
		eletro.mudarCanal(32);
		eletro.aumentarVolume(5);
		eletro.aumentarVolume(5);
		System.out.println(eletro.retornarTudo());
	}
	
}
