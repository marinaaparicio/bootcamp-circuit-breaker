package com.nttdata.bootcamp.productservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nttdata.bootcamp.dto.Price;
import com.nttdata.bootcamp.dto.Producto;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ProductoServicioRemote {
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	@CircuitBreaker(name ="prices-service", fallbackMethod = "fallBack")
	public Producto getProduct(Integer id) {
		if(id != null) {
			Producto producto = new Producto();
			final Price response = this.restTemplate.postForObject("http://localhost:8080/getProduct/" + id, null, Price.class, id);
			producto.setProductId(response.getId());
			producto.setChannel(response.getDescription());
			producto.setPort(response.getCode_product());
			return producto;
		}else {
			return null;	
		}
	}


	public Producto postProduct(Integer id) {
		if(id != null) {
			Producto producto = new Producto();
			final Price response = this.restTemplate.postForObject("http://localhost:8080/getProduct/" + id, null, Price.class, id);
			producto.setProductId(response.getId());
			producto.setChannel(response.getDescription());
			producto.setPort(response.getCode_product());
			return producto;
		}else {
			return null;	
		}
	}
	
	
	public Producto fallBack(String id, Throwable a) {
		Producto producto = new Producto();
		producto.setProductId(null);
		producto.setChannel("null");
		producto.setPort("null");
		return producto;
	}

}
