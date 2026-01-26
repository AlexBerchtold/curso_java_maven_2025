package com.cursojava.entidades;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ven_id")
	private Integer id;
	
	@Column(name = "ven_fecha", nullable = false)
	private LocalDate fecha;
	
	@Column(name = "ven_total", nullable = false)
	private Double total;
	
	@Column(name = "ven_anulada", nullable = false)
	private boolean anulada;
	
	@Column(name = "ven_obs", nullable = true, length = 250)
	private String obs;
	
	// Muchos a uno
	
	@ManyToOne(optional = false)
	private Funcionario funcionario;
	
	@ManyToOne(optional = false)
	private Cliente cliente;
	
	// Uno a muchos
	
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<VentaDetalle> detalles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public boolean isAnulada() {
		return anulada;
	}

	public void setAnulada(boolean anulada) {
		this.anulada = anulada;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<VentaDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<VentaDetalle> detalles) {
		this.detalles = detalles;
	}
	
	

}
