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
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author joel
 */
@Slf4j
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_nacimiento;

	@Column(length = 50, name = "Username", nullable = false)
	private String username;

	@Column(length = 50, name = "Password", nullable = false)
	private String password;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Post> posts;

	public Usuario() {
	}

	public Usuario(Long id, String nombres, String apellidos, String correo_electronico, String telefono, Date fecha_nacimiento, String username, String password, List<Post> posts) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo_electronico = correo_electronico;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.username = username;
		this.password = password;
		this.posts = posts;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, correo_electronico, fecha_nacimiento, id, nombres, password, posts, telefono,
				username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(correo_electronico, other.correo_electronico)
				&& Objects.equals(fecha_nacimiento, other.fecha_nacimiento) 
				&& Objects.equals(id, other.id)
				&& Objects.equals(nombres, other.nombres) 
				&& Objects.equals(password, other.password)
				&& Objects.equals(posts, other.posts) 
				&& Objects.equals(telefono, other.telefono)
				&& Objects.equals(username, other.username);
	}

}
