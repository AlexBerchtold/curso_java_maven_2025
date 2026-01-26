package com.cursojava.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_productos")
public class Producto {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id")
	private Integer id;
	
	@Column(name = "prod_codigo_barra", nullable = false, length = 100)
	private String codigoBarra;
	
	@Column(name = "prod_descripcion", nullable = false, length = 100)
	private String descripcion;
	
	@Column(name = "prod_existencia", nullable = false)
	private Double existencia;
	
	@Column(name = "prod_precio_compra", nullable = false)
	private Double precioCompra;
	
	@Column(name = "prod_precio_venta", nullable = false)
	private Double precioVenta;
	
	@Column(name = "prod_estado", nullable = false)
	private boolean estado;
	
	// Relación de uno a muchos
	
	@ManyToOne(optional = false)
	private Categoria categoria;
	
	@ManyToOne(optional = false)
	private Marca marca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getExistencia() {
		return existencia;
	}

	public void setExistencia(Double existencia) {
		this.existencia = existencia;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
