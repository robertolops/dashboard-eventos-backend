package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name="TB_ARTISTA")
public class Artista {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id  
	@Column(name="id")
	private int codigo;

	@Column(name="nomeArtistico", length=50)
	private String nomeArtistico;

	@Column(name="nacionalidade", length=30)
	private String nacionalidade;
	
	@JsonIgnoreProperties("artista")
	@OneToMany(mappedBy="artista" , cascade=CascadeType.ALL) //atributo "artista" da classe Musica 
	private List <Musica> musicas;  //(não esquecer de getter e setter)

	public Artista() {
		super();
	}
	public Artista(int codigo, String nomeArtistico, String nacionalidade, List<Musica> musicas) {
		super();
		this.codigo = codigo;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Musica> getMusicas() { //atençao -> criar lista e depois getter e setter
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
}
