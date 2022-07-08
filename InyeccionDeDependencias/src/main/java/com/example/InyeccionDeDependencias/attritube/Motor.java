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
	
	
	private String marca;
	private String modelo;

	public String getMarca() {
		return marca;
	}
	@Value("marcaMotor1")
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	@Value("modeloMotor1")
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
