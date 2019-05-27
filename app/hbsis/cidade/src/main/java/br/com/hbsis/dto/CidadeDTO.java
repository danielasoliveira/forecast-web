package br.com.hbsis.dto;

import java.util.List;

public class CidadeDTO {
	
	private Long id_global;
	private String nome;
	private String pais;
	private String sgl_pais;
	private String latitude;
	private String longitude;
	
	private List<TemperaturaDTO> temperatura;

	public Long getId_global() {
		return id_global;
	}

	public void setId_global(Long id_global) {
		this.id_global = id_global;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSgl_pais() {
		return sgl_pais;
	}

	public void setSgl_pais(String sgl_pais) {
		this.sgl_pais = sgl_pais;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public List<TemperaturaDTO> getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(List<TemperaturaDTO> temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
