/**
 * 
 */
package com.example.InyeccionDeDependencias.Qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cherito
 *
 */
@Component
public class Pajaro extends Animal implements Volador {
	
	public Pajaro(@Value("pajaro loco") String nombre,@Value("3") Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	@Override
	public void volar() {
		log.info("el pajaro esta volando");
		
	}
}
