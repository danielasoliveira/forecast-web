package br.com.hbsis.model;

import java.time.LocalDate;

public class Temperatura {

	
	private LocalDate data;
	private String dtText;
	private String temp;
	private String tempMin;
	private String tempMax;
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate date) {
		this.data = date;
	}
	public String getDtText() {
		return dtText;
	}
	public void setDtText(String dtText) {
		this.dtText = dtText;
	}

	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getTempMin() {
		return tempMin;
	}
	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}
	public String getTempMax() {
		return tempMax;
	}
	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}

	

	
	
	
	
}
