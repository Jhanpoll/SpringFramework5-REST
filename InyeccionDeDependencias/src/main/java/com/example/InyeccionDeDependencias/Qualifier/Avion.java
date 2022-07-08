/**
 * 
 */
package com.example.InyeccionDeDependencias.Qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author cherito
 *
 */
@Component
public class Avion implements Volador{
	
	
	private static final Logger log = LoggerFactory.getLogger(Avion.class);

	@Override
	public void volar() {
		log.info("el avion esta volando por Peru");
		
	}
	
	

}
