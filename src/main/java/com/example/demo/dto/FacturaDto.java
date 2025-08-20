package com.example.demo.dto;

import java.util.List;

public class FacturaDto {

	private PersonaDto persona;
	
	
	private List<ProductoDto> productos;

	public FacturaDto() {
		super();
	}

	public FacturaDto(PersonaDto persona, List<ProductoDto> productos) {
		super();
		this.persona = persona;
		this.productos = productos;
	}

	public PersonaDto getPersona() {
		return persona;
	}

	public void setPersona(PersonaDto persona) {
		this.persona = persona;
	}

	public List<ProductoDto> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDto> productos) {
		this.productos = productos;
	}

}
