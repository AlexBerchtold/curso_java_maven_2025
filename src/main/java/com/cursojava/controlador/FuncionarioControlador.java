package com.cursojava.controlador;

import java.util.List;

import com.cursojava.entidades.Funcionario;
import com.cursojava.interfaces.InterfaceABM;
import com.cursojava.servicio.FuncionarioServicio;
import com.cursojava.tablas.ModeloTablaFuncionario;
import com.cursojava.util.FechaUtil;
import com.cursojava.vista.FuncionarioVista;

public class FuncionarioControlador implements InterfaceABM {
	
	private FuncionarioVista vista;
	private ModeloTablaFuncionario modeloTablaFuncionario;
	private Funcionario funcionario;
	private List<Funcionario> funcionarios;
	private FuncionarioServicio servicio;
	
	
	public FuncionarioControlador(FuncionarioVista funcionarioVista) {
		super();
		this.vista = funcionarioVista;
		servicio = new FuncionarioServicio();
		
		//Inicializamos el modelo tabla y despues pasamos a la tabla
		modeloTablaFuncionario = new ModeloTablaFuncionario();
		this.vista.getTable().setModel(modeloTablaFuncionario);
		
		//Conectamos con la interfaz
		this.vista.setAcciones();
		this.vista.setInterfaceABM(this);
		
		estadoInicial();
		
	}
	
	private void estadoInicial() {
		this.vista.getBtnbmNuevo().setEnabled(true);
		this.vista.getBtnbmEditar().setEnabled(false);
		this.vista.getBtnbmEliminar().setEnabled(false);
		this.vista.getBtnbmCancelar().setEnabled(true);
		this.vista.getBtnbmCancelar().setText("Salir");
		this.vista.getBtnbmGuardar().setEnabled(false);
		this.vista.getTfNombre().setEnabled(false);
		this.vista.getTfApellido().setEnabled(false);
		this.vista.getTfDocumento().setEnabled(false);
		this.vista.getTfTelefono().setEnabled(false);
		this.vista.getTfEmail().setEnabled(false);
		this.vista.getTfDireccion().setEnabled(false);
		this.vista.getTfFecha().setEnabled(false);
		this.vista.getTfCargo().setEnabled(false);
		this.vista.getChbEstado().setEnabled(false);
		funcionario = null;
	}
	
	private void limpiarCampos() {
		this.vista.getTfNombre().setText("");
		this.vista.getTfApellido().setText("");
		this.vista.getTfDocumento().setText("");
		this.vista.getTfTelefono().setText("");
		this.vista.getTfEmail().setText("");
		this.vista.getTfDireccion().setText("");
		this.vista.getTfFecha().setValue(null);
		this.vista.getTfCargo().setText("");
		this.vista.getChbEstado().setSelected(true);
		funcionario = null;
	}


	@Override
	public void nuevo() {
		this.vista.getBtnbmNuevo().setEnabled(false);
		this.vista.getBtnbmEditar().setEnabled(false);
		this.vista.getBtnbmEliminar().setEnabled(false);
		this.vista.getBtnbmCancelar().setEnabled(true);
		this.vista.getBtnbmCancelar().setText("Cancelar");
		this.vista.getBtnbmGuardar().setEnabled(true);
		this.vista.getTfNombre().setEnabled(true);
		this.vista.getTfApellido().setEnabled(true);
		this.vista.getTfDocumento().setEnabled(true);
		this.vista.getTfTelefono().setEnabled(true);
		this.vista.getTfEmail().setEnabled(true);
		this.vista.getTfDireccion().setEnabled(true);
		this.vista.getTfFecha().setEnabled(true);
		this.vista.getTfCargo().setEnabled(true);
		this.vista.getChbEstado().setEnabled(true);
		funcionario = new Funcionario();
	}


	@Override
	public void editar() {
		System.out.println("Edittar");
	}


	@Override
	public void eliminar() {
		System.out.println("Eliminar");
	}


	@Override
	public void cancelar() {
		estadoInicial();
		limpiarCampos();
	}


	@Override
	public void guardar() {
		funcionario.setNombre(this.vista.getTfNombre().getText());
		funcionario.setApellido(this.vista.getTfApellido().getText());
		funcionario.setDocumento(this.vista.getTfDocumento().getText());
		funcionario.setTelefono(this.vista.getTfTelefono().getText());
		funcionario.setEmail(this.vista.getTfEmail().getText());
		funcionario.setFechaRegistro(FechaUtil.stringAFecha(this.vista.getTfFecha().getText()));
		funcionario.setDireccion(this.vista.getTfDireccion().getText());
		funcionario.setCargo(this.vista.getTfCargo().getText());
		funcionario.setEstado(this.vista.getChbEstado().isSelected());
		servicio.guardar(funcionario);
	}


	@Override
	public void buscar() {
		System.out.println("Buscar");
	}


	@Override
	public void salir() {
		this.vista.dispose();
	}
	
	

}
