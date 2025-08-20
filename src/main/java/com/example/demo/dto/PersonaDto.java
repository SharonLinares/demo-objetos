package com.example.demo.dto;

public class PersonaDto {

	private String tipoDoc;
	private String numeroDoc;
	private String nombreCompleto;

	public PersonaDto() {
		super();
	}

	public PersonaDto(String tipoDoc, String numeroDoc, String nombreCompleto) {
		super();
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.nombreCompleto = nombreCompleto;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
