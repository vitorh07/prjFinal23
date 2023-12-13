package com.prjFinal.PowerDevs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_jogo")
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String name;	
	private String squad;
	private String genero;	
	private String descricao;	
	private String integrantes;
	private String url;	
	private String thumbnailpath;
	public Jogo() {
    	
	}   
	
	public Jogo(Long id, String name, String squad, String genero, String descricao, String integrantes, String url, String thumbnailpath) {
		super();
		this.id = id;
		this.name = name;
		this.squad = squad;
		this.genero = genero;
		this.descricao = descricao;
		this.integrantes = integrantes;
		this.url = url;
		this.thumbnailpath = thumbnailpath;
	}
	//ADICIONAR OS METODOS SETS E GETS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSquad() {
		return squad;
	}

	public void setSquad(String squad) {
		this.squad = squad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailpath() {
		return thumbnailpath;
	}

	public void setThumbnailpath(String thumbnailpath) {
		this.thumbnailpath = thumbnailpath;
	}
	
}