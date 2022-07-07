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
	
	@Autowired
	public Auto(@Value("marcaoAuto1") String marca, @Value("modeloAuto1") String modelo, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
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
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}
	
	
	
}
