package com.miempresa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
	@RequestMapping("/saludar")
	public String Saludar() {
		String saludo = "<h1>Hola mundo desde <b>Spring Boot</h1>";
		return saludo+"<br/><a href='/'>Volver</a>";
	}
	@RequestMapping("/misdatos")
	public String MisDatos() {
		String nombres = "Eduardo Hinojosa Amudio";
		int edad = 18;
		String carrera = "Diseño y Desarrollo de Software";
		return "<h3>Me llamo "+nombres+" tengo "+edad+
				" años y estoy estudiando la carrera de "+carrera+"</h3>"
				+"<br/><a href='/'>Volver</a>";
	}
	@RequestMapping("/")
	public String Indice() {
		String enlaces = "<a href='/saludar'>LLamar a saludar</a><br/>";
		enlaces += "<a href='/misdatos'>Ver mis datos</a>";
		return enlaces;
	}
}
