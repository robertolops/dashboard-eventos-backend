package br.com.concessionaria.modelo;

public class Formula1 {

	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;

	//sintaxe para metodos
	// <modificador> <tipo de retorno> <nomeMetodo> (<tipoParam> <nomeParam>) {

	public void preencherEscuderia(String pEscuderia) {
		escuderia=pEscuderia.toUpperCase();
	}
	public String retornarEscuderia() {
		return escuderia;
	}
	public void preencherCor(String pCor ) {
		cor=pCor.toUpperCase();
	}
	public String retornarCor() {
		return cor;
	}
	public void preencherValor(float pValor) {
		valor=pValor;
	}
	public float retornarValor() {
		return valor;
	}
	public String ligar() {
		status=true;
		return "Carro ligado!";
	}
	public String desligar() {
		status=false;
		return "Carro desligado!";
	}
	public void acelerar(float pVelocidade) {
		if (status==true) {
			velocidadeAtual+=pVelocidade;		
		}
	}
	public void desacelerar(float pVelocidade) {
		if (status==true) {
			velocidadeAtual-=pVelocidade;
			if (velocidadeAtual<0) {
				velocidadeAtual=0;
			}
		}
	}
	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}

}//fechar classe


