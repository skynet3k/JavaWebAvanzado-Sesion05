package com.tecsup.javawebavanzado_sesion05.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ejercicio3")
public class Mapeo3Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Mapeo3Controller.class);

	@RequestMapping(value="/{nombre}", method = RequestMethod.GET)
	public String mostrarNombre(@PathVariable("nombre") String nombre, Model model) {
				
		logger.info("Nombre: " + nombre);
		
		model.addAttribute("mensaje", nombre);
		
		return "ejercicio3";
	}
	
	
	@RequestMapping(value="/caso2/{nombre}", method = RequestMethod.GET)
	public String mostrarNombreCaso2(
			@PathVariable String nombre, 
			Model model) {
				
		logger.info("Nombre: " + nombre);
		
		model.addAttribute("mensaje", nombre);
		
		return "ejercicio3";
	}
	
	@RequestMapping(value="/caso3/{nombre}/{apPaterno}/{apMaterno}", method = RequestMethod.GET)
	public String mostrarNombreCaso3(
			@PathVariable String nombre, 
			@PathVariable String apPaterno, 
			@PathVariable String apMaterno, 
			Model model) {
				
		logger.info("Nombre: " + nombre);
		logger.info("Apellido Paterno: " + apPaterno);
		logger.info("Apellido Materno: " + apMaterno);
		
		model.addAttribute("mensaje", apPaterno + " " + apMaterno + ", " + nombre);
		
		return "ejercicio3";
	}
	
	@RequestMapping(value="/caso4/{nombre}/{apPaterno}", method = RequestMethod.GET)
	public String mostrarNombreCaso4(
			@PathVariable String nombre, 
			@PathVariable String apPaterno, 
			Model model) {
				
		logger.info("Nombre: " + nombre);
		logger.info("Apellido Paterno: " + apPaterno);
				
		model.addAttribute("mensaje", apPaterno + ", " + nombre);
		
		return "ejercicio3";
	}

}
