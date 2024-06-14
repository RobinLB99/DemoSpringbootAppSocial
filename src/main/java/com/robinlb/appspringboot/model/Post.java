package com.robinlb.appspringboot.model;

import jakarta.annotation.Nonnull;
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
import java.util.Objects;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author joel
 */
@Slf4j
@Entity
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Nonnull
	@Column(name = "Contenido", length = 255, nullable = false)
	private String contenido;

	@Nonnull
	@Column(name = "Creacion", nullable = false)
	private Date fecha_creacion;

	@Nonnull
	@Column(name = "Modificacion", nullable = false)
	private Date fecha_modificacion;

	@Nonnull
	@Column(name = "Pictures", nullable = false)
	private List<String> pictures;

	@ManyToOne
	@JoinColumn(name = "Usuario_ID", nullable = false)
	@Nonnull
	private Usuario usuario;

	public Post() {
	}

	public Post(Long id, String contenido, Date fecha_creacion, Date fecha_modificacion, List<String> pictures, Usuario usuario) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.fecha_creacion = fecha_creacion;
		this.fecha_modificacion = fecha_modificacion;
		this.pictures = pictures;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public List<String> getPictures() {
		return pictures;
	}

	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contenido, fecha_creacion, fecha_modificacion, id, pictures, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(contenido, other.contenido)
				&& Objects.equals(fecha_creacion, other.fecha_creacion)
				&& Objects.equals(fecha_modificacion, other.fecha_modificacion)
				&& Objects.equals(id, other.id)
				&& Objects.equals(pictures, other.pictures) 
				&& Objects.equals(usuario, other.usuario);
	}

}
