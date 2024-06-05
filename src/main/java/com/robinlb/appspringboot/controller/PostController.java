package com.robinlb.appspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robinlb.appspringboot.model.Post;
import com.robinlb.appspringboot.service.IPostService;

@Controller
@RequestMapping(path = "/Post")
public class PostController {

	@Autowired
	private IPostService service;
	
	@PostMapping(path = "/publicar")
	public String publicar(Post post) {
		service.guardar(post);
		return "";
	}
	
	@PostMapping(path = "/eliminar/{id}")
	public String borrarPost(@PathVariable(name = "id") Long id) {
		service.eliminar(id);
		return "";
	}
	
	@GetMapping(path = "/{id}")
	public String buscarPost(@PathVariable(name = "id") Long id) {
		service.buscar(id);
		return "";
	}
	
	@GetMapping(path = "/todos")
	public String listarPosts() {
		service.listar();
		return "";
	}
	
}
