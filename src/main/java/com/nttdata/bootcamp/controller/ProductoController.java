package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.dto.Producto;
import com.nttdata.bootcamp.productservice.ProductoServicioI;


@RestController
@RequestMapping("/product")
public class ProductoController {
	
	@Autowired
	private ProductoServicioI productoServicio;
	
	
	@GetMapping("{id}")
	public Producto getProducto(@PathVariable Integer id) {
		
		return productoServicio.getProducto(id);
	}
	
	@PostMapping("{id}")
	private Producto postProducto(@PathVariable Integer id) {
		
		return productoServicio.postProducto(id);
	}
	

	
	

}
