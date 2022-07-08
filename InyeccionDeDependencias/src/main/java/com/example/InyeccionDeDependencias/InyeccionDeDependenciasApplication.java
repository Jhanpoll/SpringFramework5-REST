package com.example.InyeccionDeDependencias;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.InyeccionDeDependencias.Qualifier.Animal;
import com.example.InyeccionDeDependencias.Qualifier.Avion;
import com.example.InyeccionDeDependencias.Qualifier.Pajaro;
import com.example.InyeccionDeDependencias.Qualifier.Perro;
import com.example.InyeccionDeDependencias.attritube.Auto;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class InyeccionDeDependenciasApplication {
	

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext context = SpringApplication.run(InyeccionDeDependenciasApplication.class, args);
		
		Animal animal = context.getBean("pajaro",Animal.class);
		System.out.println(animal.getNombre()+ "\t"+animal.getEdad());
		
		
		/*
		 * Pajaro pajaro = context.getBean(Pajaro.class); pajaro.volar(); Avion avion =
		 * context.getBean(Avion.class); avion.volar();
		 * 
		 * Perro perro = context.getBean(Perro.class);
		 * System.out.println("objeto perro = {%s} edad = {%s} "+perro.getNombre()+"\t"+
		 * perro.getEdad());
		 */
		/*
		 * Auto auto = context.getBean(Auto.class); System.out.println(auto);
		 */
	}

}
