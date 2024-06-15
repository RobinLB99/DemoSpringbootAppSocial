package com.robinlb.appspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.robinlb.appspringboot.model.Post;
import com.robinlb.appspringboot.model.Usuario;

@Controller
public class directionController {

	@GetMapping("registrar")
	public String goRegistro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "registro";
	}

	@GetMapping("publicar")
	public String goPublicar(Model model) {
		model.addAttribute("post", new Post());
		return "nueva_publicacion";
	}

	@GetMapping("main")
	public String goInicio(Model model) {
	    Boolean registrado = (Boolean) model.getAttribute("registrado");
	    if (registrado != null) {
	        model.addAttribute("registroExitoso", registrado);
	    }
	    return "index";
	}

}
