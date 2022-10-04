package com.nttdata.bootcamp.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MicroservicioMasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioMasApplication.class, args);
	}

}
