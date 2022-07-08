/**
 * 
 */
package com.example.InyeccionDeDependencias.Qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cherito
 *
 */
@Component
public class Perro extends Animal {
	
	public Perro(@Value("firulais")String nombre,@Value("1") Integer edad) {
		super(nombre, edad);
	}

}
