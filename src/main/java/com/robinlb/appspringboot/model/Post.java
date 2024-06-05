package com.robinlb.appspringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "Contenido", length = 255, nullable = false)
    private String contenido;
    
    @Column(name = "Creacion", nullable = false)
    private Date fecha_creacion;
    
    @Column(name = "Modificacion", nullable = false)
    private Date fecha_modificacion;
    
    @Column(name = "Pictures", nullable = false)
    private List<String> pictures;
    
    @ManyToOne
    @JoinColumn(name = "Usuario_ID", nullable = false)
    private Usuario usuario;
    
    public Post() {}
    
}
