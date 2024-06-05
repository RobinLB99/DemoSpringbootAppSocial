package com.robinlb.appspringboot.service;

import com.robinlb.appspringboot.model.Usuario;
import com.robinlb.appspringboot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author joel
 */
@Service
public class IUsuarioService implements UsuarioService{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) repository.findAll();
    }
    
    
}
