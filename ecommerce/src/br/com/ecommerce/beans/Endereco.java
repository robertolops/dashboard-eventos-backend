package br.com.ecommerce.beans;

public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public void setAll(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public String getAll( ) {
		return 
				"Logradouro..: " + logradouro + "\n" +
				"Numero......: " + numero + "\n" +
				"Complemento.: " + complemento + "\n" +
				"Bairro......: " + bairro + "\n" +
				"Cidade......: " + cidade + "\n" +
				"Estado......: " + estado + "\n" +
				"CEP.........: " + cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}//fecha classe
