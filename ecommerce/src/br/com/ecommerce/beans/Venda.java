package br.com.ecommerce.beans;

public class Venda {

	private int notaFiscal;
	private float total;
	private float desconto;
	private String data;
	private Cliente cliente;
	private Produto produto;

	public String getAll( ) {
		return 
				"Nota Fiscal..: " + notaFiscal + "\n" +
				"Total........: " + total + "\n" +
				"Desconto.....: " + desconto + "\n" +
				"Data.........: " + data + "\n" +
				"Cliente......: \n" + cliente.getAll() + "\n" +
				"Produto......: \n" + produto.getAll();
	}
	public void setAll(int notaFiscal, float total, float desconto, String data, Cliente cliente, Produto produto) {
		this.notaFiscal = notaFiscal;
		this.total = total;
		this.desconto = desconto;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	public Venda() {
		super();
	}
	public Venda(int notaFiscal, float total, float desconto, String data, Cliente cliente, Produto produto) {
		super();
		this.notaFiscal = notaFiscal;
		this.total = total;
		this.desconto = desconto;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}


}//fecha class
