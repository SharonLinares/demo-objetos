package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.PersonaDto;

public class PersonaService {

	private List<PersonaDto> personas;

	public PersonaService() {
		super();
		this.personas = new ArrayList<>();
	}

	public void crearPersona(String tipoDoc, String numeroDoc, String nombreCompleto) {
		this.personas.add(new PersonaDto(tipoDoc, numeroDoc, nombreCompleto));

	}

	public List<PersonaDto> consultarPersonas() {
		return personas;

	}

	public PersonaDto consultarPersona(String numeroDocumento) {
		for (PersonaDto persona : personas) {
			if (persona.getNumeroDoc().equals(numeroDocumento)) {
				return persona;
			}

		}
		return null;
	}
	
	

}
