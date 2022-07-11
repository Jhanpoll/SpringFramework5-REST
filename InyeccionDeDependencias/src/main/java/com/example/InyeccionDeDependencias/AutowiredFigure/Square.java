package com.example.InyeccionDeDependencias.AutowiredFigure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {
	
	@Value("${square.side}")
	double side;
	
	@Override
	public double calculateArea() {
		
		return side*=side;
	}

}
