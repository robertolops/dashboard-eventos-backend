package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //para informar ao Spring boot que esta classe tem uma tabela no BD
@Table(name="TB_USUARIO")
public class Usuario {


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id  //para indicar que este atributo faz ligação com a PK(chave primaria) da tabela usuario
	@Column(name="id")
	private int codigo;

	@Column(name="nome", length=40)
	private String nome;

	@Column(name="email", length=70)
	private String email;

	@Column(name="senha", length=20)
	private String senha;

	@Column(name="foto", length=100)
	private String foto;
	
	@Column(name="racf", length=7)
	private String racf;
	
	public Usuario() {
		super();
	}
	public Usuario(int codigo, String nome, String email, String senha, String foto, String racf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
		this.racf = racf;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
}
