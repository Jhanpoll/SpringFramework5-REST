package com.example.InyeccionDeDependencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.InyeccionDeDependencias.attritube.Auto;

@SpringBootApplication
public class InyeccionDeDependenciasApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InyeccionDeDependenciasApplication.class, args);
		
		Auto auto = context.getBean(Auto.class);
		System.out.println(auto);
	}

}
