package com.example.InyeccionDeDependencia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.InyeccionDeDependencia.attribute.Auto;
import com.example.InyeccionDeDependencia.attribute.Motor;

@SpringBootApplication
public class InyeccionDeDependenciaApplication {

	
	private static final Logger log = LoggerFactory.getLogger(InyeccionDeDependenciaApplication.class);

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InyeccionDeDependenciaApplication.class, args);
		
		Auto auto = context.getBean(Auto.class);
		System.out.println(auto);
		/*
		 * Motor motor = new Motor("xl1","modelo1"); Auto auto = new
		 * Auto("xl2","modelo2",motor); System.out.println(auto);
		 */
	}

}
