package com.soaint.join.day;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("calculadora")
@RestController
public class Calculadora {
	
    @GetMapping("/sumar")
	public int sumar(@RequestParam(name="valor1") int valor1, @RequestParam("Valor2") int valor2 ) {
		
		System.out.println(".::Operacion sumar !::.");
		return valor1 + valor2;
		
	}
    
    @GetMapping("/multiplicar")
	public int multiplicar(@RequestParam(name="valor1") int valor1, @RequestParam("Valor2") int valor2 ) {
		
		System.out.println(".::Operacion multiplicar !::.");
		return valor1 * valor2;
		
	}

}
