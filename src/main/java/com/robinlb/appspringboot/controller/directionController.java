package com.robinlb.appspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robinlb.appspringboot.model.Usuario;

@Controller
@RequestMapping("/redirigir")
public class directionController {

	@GetMapping("registrar")
	public String getRegistro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "redirect:/registrase";
	}

}
