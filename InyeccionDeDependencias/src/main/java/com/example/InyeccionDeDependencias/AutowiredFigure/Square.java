package com.example.InyeccionDeDependencias.AutowiredFigure;

import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {

	@Override
	public double calculateArea() {
		double side = 4;
		return side*=side;
	}

}
