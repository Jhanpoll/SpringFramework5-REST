package com.example.InyeccionDeDependencias.AutowiredFigure;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure {

	@Override
	public double calculateArea() {

		final double radio=2;
		
		return Math.PI*(Math.pow(radio, 2));
		
	}

}
