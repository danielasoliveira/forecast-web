package br.com.hbsis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "CIDADE")
public class Cidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Long idGlobal;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String pais;
	
	@NotNull
	private String sglPais;
	
	public Long getIdGlobal() {
		return idGlobal;
	}
	public void setIdGlobal(Long idGlobal) {
		this.idGlobal = idGlobal;
	}
	public String getSglPais() {
		return sglPais;
	}
	public void setSglPais(String sglPais) {
		this.sglPais = sglPais;
	}
	private String latitude;
	private String longitude;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idGlobal == null) ? 0 : idGlobal.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((sglPais == null) ? 0 : sglPais.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idGlobal == null) {
			if (other.idGlobal != null)
				return false;
		} else if (!idGlobal.equals(other.idGlobal))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (sglPais == null) {
			if (other.sglPais != null)
				return false;
		} else if (!sglPais.equals(other.sglPais))
			return false;
		return true;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	
	
	@Override
	public String toString() {
		return "Cidade [id=" + id + ", idGlobal=" + idGlobal + ", nome=" + nome + ", pais=" + pais + ", sglPais="
				+ sglPais + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
