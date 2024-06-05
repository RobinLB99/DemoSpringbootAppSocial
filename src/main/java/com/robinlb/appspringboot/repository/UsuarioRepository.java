package com.robinlb.appspringboot.repository;

import com.robinlb.appspringboot.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author joel
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
}
