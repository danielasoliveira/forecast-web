package br.com.hbsis.dto;

import java.util.Date;

public class TemperaturaDTO {
	
	private String temperaturaAgora;
	private String temperaturaMinima;
	private String temperaturaMaxima;
	private Date data;
	
	public String getTemperaturaAgora() {
		return temperaturaAgora;
	}
	public void setTemperaturaAgora(String temperaturaAgora) {
		this.temperaturaAgora = temperaturaAgora;
	}
	public String getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(String temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public String getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(String temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
