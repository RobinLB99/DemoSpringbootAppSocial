package com.robinlb.appspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robinlb.appspringboot.model.Post;
import com.robinlb.appspringboot.repository.PostRepository;

@Service
public class IPostService implements PostService {

	@Autowired
	private PostRepository repository;

	@Override
	public Post guardar(Post post) {
		return repository.save(post);
	}

	@Override
	public void eliminar(Long id) {
		repository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Post buscar(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Post> listar() {
		return (List<Post>) repository.findAll();
	}

}
