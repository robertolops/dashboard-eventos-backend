package br.com.ecommerce.beans;

public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;

	public float getDesconto(float porcentagem) {
		return valorVenda - valorVenda * (porcentagem/100);
	}
	public void ajustarValores (float valor) {
		valorVenda+=valor;
		valorCompra+=valor;	
	}
	public float getDesconto() {
		return (valorVenda*(float)0.9);
	}
	public float totalVenda() {
		return valorVenda*qtde;
	}
	public float totalCompra() {
		return valorCompra*qtde;		
	}
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}
	public String getAll( ) {
		return 
				"ID: " + id + "\n" +
				"Descrição: " + descricao + "\n" +
				"Valor de venda: " + valorVenda + "\n" +
				"Valor de compra: " + valorCompra + "\n" +
				"Quantidade: " + qtde;
	}
	public Produto() {
		super();
	}
	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}


}//fecha classe
