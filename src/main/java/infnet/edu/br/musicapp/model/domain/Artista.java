package infnet.edu.br.musicapp.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tArtista")

public class Artista {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int anoDeOrigem;
	private String img;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "idArtista")
	@JsonIgnore
	private List<Album> albuns;
	
	public Artista() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeOrigem() {
		return anoDeOrigem;
	}
	public void setAnoDeOrigem(int anoDeOrigem) {
		this.anoDeOrigem = anoDeOrigem;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public List<Album> getAlbuns() {
		return albuns;
	}
	public void setAlbuns(List<Album> artistas) {
		this.albuns = artistas;
	}
	
	
	
}
