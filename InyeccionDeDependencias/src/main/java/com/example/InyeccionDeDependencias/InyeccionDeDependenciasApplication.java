package com.example.InyeccionDeDependencias;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.example.InyeccionDeDependencias.AutowiredFigure.AreaCalculator;
import com.example.InyeccionDeDependencias.Profiles.EnviromentService;
import com.example.InyeccionDeDependencias.Qualifier.Animal;
import com.example.InyeccionDeDependencias.Qualifier.Avion;
import com.example.InyeccionDeDependencias.Qualifier.Pajaro;
import com.example.InyeccionDeDependencias.Qualifier.Perro;
import com.example.InyeccionDeDependencias.Scopes.EjemploScopeService;
import com.example.InyeccionDeDependencias.attritube.Auto;



@SpringBootApplication
public class InyeccionDeDependenciasApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(InyeccionDeDependenciasApplication.class);

	public static void main(String[] args) {

		ExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression("10 < 20");
		log.info("expresion es {} ", expression.getValue());
	}
}
