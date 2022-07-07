/**
 * 
 */
package com.example.InyeccionDeDependencias.attritube;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cherito
 *
 */
@Component
public class Motor {
	
	@Value("marcaMotor1")
	private String marca;
	
	@Value("modeloMotor1")
	private String modelo;
	

	public Motor() {
		
	}
	
	
	public Motor(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
