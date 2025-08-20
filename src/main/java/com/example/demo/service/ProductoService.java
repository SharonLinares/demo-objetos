package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.ProductoDto;

public class ProductoService {

	private List<ProductoDto> productos;

	public ProductoService() {
		super();
		this.productos = new ArrayList<>();
	}

	public void crearProducto(String nombre, int cantidad, int valor) {
		ProductoDto producto = new ProductoDto(nombre, cantidad, valor);
		this.productos.add(producto);
	}

	public List<ProductoDto> consultarProdutos() {
		return productos;
	}

	public ProductoDto consultarProdutos(String nombreProduto) {
		for (ProductoDto producto : productos) {
			if (producto.getNombre().equals(nombreProduto)) {
				return producto;
			}
		}
		return null;
	}

}
