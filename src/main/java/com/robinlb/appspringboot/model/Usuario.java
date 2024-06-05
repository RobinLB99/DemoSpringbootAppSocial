package com.robinlb.appspringboot.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author joel
 */
@Data
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(length = 50, name = "Nombres", nullable = false)
    private String nombres;
    
    @Column(length = 50, name = "Apellidos", nullable = false)
    private String apellidos;
    
    @Column(length = 70, name = "Email", nullable = false)
    private String correo_electronico;
    
    @Column(length = 15, name = "Telefono", nullable = false)
    private String telefono;
    
    @Column(name = "Nacimiento", nullable = false)
    private Date fecha_nacimiento;
    
    @Column(length = 50, name = "Username", nullable = false)
    private String username;
    
    @Column(length = 50, name = "Password", nullable = false)
    private String password;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;
    
    public Usuario(){}
    
}
