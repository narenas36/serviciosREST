package com.nico.service.method;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Calculadora")
public class ServicioMetodo {

	public int opcion = 3; // Opcion de operacion
	public double numero1 = 5; // Primer valor
	public double numero2 = 5; // Segundo valor
	
	// Metodo para calcular valores
	@GetMapping
	public String calculoResultado() {
		double resp;
		switch (opcion) {
		case 1:
			resp = numero1 + numero2;
			return "Resultado: " + resp;
		case 2:
			resp = numero1 - numero2;
			return "Resultado: " + resp;
		case 3:
			resp = numero1 * numero2;
			return "Resultado: " + resp;
		case 4:
			resp = numero1 / numero2;
			return "Resultado: " + resp;
		default:
			return "Error!!! Opcion inexistente.";
		}
	}
}

