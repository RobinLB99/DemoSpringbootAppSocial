package com.robinlb.appspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robinlb.appspringboot.model.Post;
import com.robinlb.appspringboot.model.Usuario;

@Controller
public class directionController {

	@GetMapping("registrar")
	public String getRegistro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "registro";
	}

	@GetMapping("publicar")
	public String getPublicar(Model model) {
		model.addAttribute("post", new Post());
		return "nueva_publicacion";
	}

	@GetMapping("main")
	public String getInicio() {
		return "index";
	}

}
