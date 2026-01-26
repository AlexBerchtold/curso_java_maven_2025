package com.cursojava.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Integer id;
	
	@Column(name = "cli_nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "cli_apellido", nullable = false, length = 50)
	private String apellido;
	
	@Column(name = "cli_documento", nullable = false, length = 50)
	private String documento;
	
	@Column(name = "cli_telefono", nullable = false, length = 45)
	private String telefono;
	
	@Column(name = "cli_email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "cli_direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "cli_estado", nullable = false)
	private boolean estado;
	
	@Column(name = "cli_fecha_registro", nullable = false)
	private LocalDate fechaRegistro;

	public Cliente() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
