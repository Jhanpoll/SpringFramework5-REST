/**
 * 
 */
package com.example.InyeccionDeDependencias.Scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author cherito
 *
 */

@Service
@Scope("prototype")
public class EjemploScopeService {
	
}
