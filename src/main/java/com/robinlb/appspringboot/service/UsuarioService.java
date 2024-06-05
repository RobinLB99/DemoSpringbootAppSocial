package com.robinlb.appspringboot.service;

import com.robinlb.appspringboot.model.Usuario;
import java.util.List;

/**
 *
 * @author joel
 */
public interface UsuarioService {

    public Usuario guardar(Usuario usuario);
    
    public void eliminar(Long id);
    
    public Usuario editar(Usuario usuario);
    
    public Usuario buscar(Long id);
    
    public List<Usuario> listar();
    
}
