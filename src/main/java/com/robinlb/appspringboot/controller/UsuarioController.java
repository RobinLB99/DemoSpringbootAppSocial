package com.robinlb.appspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robinlb.appspringboot.model.Post;
import com.robinlb.appspringboot.service.IPostService;

@RequestMapping("/Usuario")
public class UsuarioController {

	@Autowired
	private IPostService service;
	
	@PostMapping("publicar")
	public String postear(Post post) {
		service.guardar(post);
		return "";
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
