package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.ProductoDto;

public class FacturaService {

	private List<FacturaDto> facturas;

	public FacturaService() {
		super();
		this.facturas = new ArrayList<>();

	}

	public void crearFactura(PersonaDto personaDto, List<ProductoDto> productos) {
		this.facturas.add(new FacturaDto(personaDto, productos));
	}

}
