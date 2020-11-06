package br.com.ecommerce.beans;

public class PessoaFisica extends Cliente { //acrescentar extends por ser subclasse de Cliente (aceita apenas uma classe pai) 

	private String cpf;
	private String rg;

	public void setAll(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super.setAll(id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getAll() {
		return
				super.getAll() + "\n" +
				"CPF.: " + cpf + "\n" +
				"RG..: " + rg;
	}
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super(id, nome, fone, endereco);  
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

}//fecha class
