package com.nttdata.bootcamp.productservice;

import com.nttdata.bootcamp.dto.Producto;

public interface ProductoServicioI {
	
	public Producto getProducto(Integer id);
	
	public Producto postProducto(Integer id);

}
