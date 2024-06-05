package com.robinlb.appspringboot.service;

import java.util.List;

import com.robinlb.appspringboot.model.Post;

public interface PostService {

	public Post guardar(Post post);
	
	public void eliminar(Long id);
	
	public Post buscar(Long id);
	
	public List<Post> listar();
	
}
