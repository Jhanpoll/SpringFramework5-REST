/**
 * 
 */
package com.example.InyeccionDeDependencias.attritube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author cherito
 *
 */
@Component
public class Auto {
	
	private String marca;	
	private String modelo;
	private Motor motor;

	
	public String getMarca() {
		return marca;
	}
	@Value("marcaoAuto1")
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	@Value("modeloAuto1")
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	@Autowired
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}
	
	
	
}
