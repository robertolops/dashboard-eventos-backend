package br.com.concessionaria.teste;

import br.com.concessionaria.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		
		Formula1 objeto = null;    //criar um objeto
		Formula1 carro = new Formula1();    //instanciar um objeto
		carro.preencherEscuderia("ferrari");
		carro.preencherValor((float) 100.10);
		carro.preencherCor("VermElhA");
	
		
		System.out.println(carro.retornarEscuderia());
		System.out.println(carro.retornarCor());
		System.out.println(carro.retornarValor());
		System.out.println(carro.ligar());
		System.out.println(carro.desligar());

		carro.acelerar(50);
		carro.acelerar(30);
		System.out.println(carro.retornarVelocidadeAtual());
		carro.desacelerar(70);
		System.out.println(carro.retornarVelocidadeAtual());
	}

}
