package com.example.InyeccionDeDependencias.AutowiredFigure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure {
	
	@Value("${circle.radio}")
	final double radio=0;
	
	@Override
	public double calculateArea() {
		return Math.PI*(Math.pow(radio, 2));
	}

}
