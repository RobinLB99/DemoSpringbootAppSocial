package com.robinlb.appspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robinlb.appspringboot.model.Usuario;
import com.robinlb.appspringboot.service.IUsuarioService;

@Controller
@RequestMapping("Usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@PostMapping("registrar")
	public String registrarUsuario(Usuario usuario) {
		service.guardar(usuario);
		return "redirect:/main";
	}
	
	@PostMapping("eliminar")
	public String eliminarPost(Long id) {
		service.eliminar(id);
		return "";
	}
	
	@GetMapping("{id}")
	public String buscarUsuario(Long id) {
		service.buscar(id);
		return "";
	}
	
	@GetMapping("todos")
	public String listarUsuarios() {
		service.listar();
		return "";
	}
	
}
