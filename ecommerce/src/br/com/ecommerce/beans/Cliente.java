package br.com.ecommerce.beans;

public class Cliente {

	private int id;
	private String nome;
	private String fone;
	private Endereco endereco = new Endereco();

	public void setAll(int id, String nome, String fone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}
	public String getAll( ) {
		return 
				"ID.......: " + id + "\n" +
				"Nome.....: " + nome + "\n" +
				"Fone.....: " + fone + "\n" +
				"Endereço.: \n" + endereco.getAll();
	}
	public Cliente() {
		super();
	}
	public Cliente(int id, String nome, String fone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


}//fecha class
