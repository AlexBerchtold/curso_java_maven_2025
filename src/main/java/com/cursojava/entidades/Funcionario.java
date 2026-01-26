package com.cursojava.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fun_id")
	private Integer id;
	
	@Column(name = "fun_nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "fun_apellido", nullable = false, length = 50)
	private String apellido;
	
	@Column(name = "fun_documento", nullable = false, length = 50)
	private String documento;
	
	@Column(name = "fun_telefono", nullable = false, length = 45)
	private String telefono;
	
	@Column(name = "fun_email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "fun_direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "fun_estado", nullable = false)
	private boolean estado;
	
	@Column(name = "fun_fecha_registro", nullable = false)
	private LocalDate fechaRegistro;
	
	@Column(name = "fun_cargo", nullable = false, length = 50)
	private String cargo;
	
	
	// Metodo Contructor

	public Funcionario() {
		super();
	}
	
	// Getters y Setters

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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
