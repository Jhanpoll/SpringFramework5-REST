package com.example.InyeccionDeDependencias;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.InyeccionDeDependencias.Profiles.EnviromentService;
import com.example.InyeccionDeDependencias.Qualifier.Animal;
import com.example.InyeccionDeDependencias.Qualifier.Avion;
import com.example.InyeccionDeDependencias.Qualifier.Pajaro;
import com.example.InyeccionDeDependencias.Qualifier.Perro;
import com.example.InyeccionDeDependencias.Scopes.EjemploScopeService;
import com.example.InyeccionDeDependencias.attritube.Auto;



@SpringBootApplication
public class InyeccionDeDependenciasApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(InyeccionDeDependenciasApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(InyeccionDeDependenciasApplication.class, args);
		EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
		EjemploScopeService ejemploScopeService2 = context.getBean(EjemploScopeService.class);
		
		log.info("son iguales a nivel de objeto = {}", ejemploScopeService1==ejemploScopeService2);
		log.info("son iguales a nivel de valor = {}", ejemploScopeService1.equals(ejemploScopeService2));
	}
}
