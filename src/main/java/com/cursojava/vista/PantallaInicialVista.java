package com.cursojava.vista;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.EmptyBorder;

import com.cursojava.componentes.JButonPantallaPrincipal;
import com.cursojava.componentes.JMenuItemPersonalizado;
import com.cursojava.componentes.JPanelPantallaPrincipal;

public class PantallaInicialVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelPantallaPrincipal contentPane;
	private JMenuItemPersonalizado mnCategorias;
	private JMenuItemPersonalizado mnClientes;
	private JMenuItemPersonalizado mnFuncionarios;
	private JMenuItemPersonalizado mnMarcas;
	private JMenuItemPersonalizado mnProductos;
	private JMenuItemPersonalizado mnVentas;
	private JMenuItemPersonalizado mnListadoCategorias;
	private JMenuItemPersonalizado mnListadoClientes;
	private JMenuItemPersonalizado mnListadoFuncoinarios;
	private JMenuItemPersonalizado mnListadoMarcas;
	private JMenuItemPersonalizado mnListadoProductos;
	private JMenuItemPersonalizado mnListadoVentas;
	private JMenuItemPersonalizado mnConfiguracinoes;
	private JButonPantallaPrincipal btnClientes;
	private JButonPantallaPrincipal btnProductos;
	private JButonPantallaPrincipal btnVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicialVista frame = new PantallaInicialVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaInicialVista() {
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(this);
		setTitle("Sistema de Ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registros");
		mnNewMenu.setMargin(new Insets(5, 20, 5, 20));
		menuBar.add(mnNewMenu);
		
		mnCategorias = new JMenuItemPersonalizado();
		mnCategorias.setText("Categorias");
		mnNewMenu.add(mnCategorias);
		
		mnClientes = new JMenuItemPersonalizado();
		mnClientes.setText("Clientes");
		mnNewMenu.add(mnClientes);
		
		mnFuncionarios = new JMenuItemPersonalizado();
		mnFuncionarios.setText("Funcionarios");
		mnNewMenu.add(mnFuncionarios);
		
		mnMarcas = new JMenuItemPersonalizado();
		mnMarcas.setText("Marcas");
		mnNewMenu.add(mnMarcas);
		
		mnProductos = new JMenuItemPersonalizado();
		mnProductos.setText("Productos");
		mnNewMenu.add(mnProductos);
		
		JMenu mnTransacciones = new JMenu("Transacciones");
		mnTransacciones.setMargin(new Insets(5, 20, 5, 20));
		menuBar.add(mnTransacciones);
		
		mnVentas = new JMenuItemPersonalizado();
		mnVentas.setText("Ventas");
		mnTransacciones.add(mnVentas);
		
		JMenu mnListados = new JMenu("Listados");
		mnListados.setMargin(new Insets(5, 20, 5, 20));
		menuBar.add(mnListados);
		
		mnListadoCategorias = new JMenuItemPersonalizado();
		mnListadoCategorias.setText("Listado de Categorias");
		mnListados.add(mnListadoCategorias);
		
		mnListadoClientes = new JMenuItemPersonalizado();
		mnListadoClientes.setText("Listado de Clientes");
		mnListados.add(mnListadoClientes);
		
		mnListadoFuncoinarios = new JMenuItemPersonalizado();
		mnListadoFuncoinarios.setText("Listado de Funcionarios");
		mnListados.add(mnListadoFuncoinarios);
		
		mnListadoMarcas = new JMenuItemPersonalizado();
		mnListadoMarcas.setText("Listado de Marcas");
		mnListados.add(mnListadoMarcas);
		
		mnListadoProductos = new JMenuItemPersonalizado();
		mnListadoProductos.setText("Listado de Productos");
		mnListados.add(mnListadoProductos);
		
		JMenu mnInformes = new JMenu("Informes");
		mnInformes.setMargin(new Insets(5, 20, 5, 20));
		menuBar.add(mnInformes);
		
		mnListadoVentas = new JMenuItemPersonalizado();
		mnListadoVentas.setText("Informe de Ventas");
		mnInformes.add(mnListadoVentas);
		
		JMenu mnUtilidades = new JMenu("Utilidades");
		mnUtilidades.setMargin(new Insets(5, 20, 5, 20));
		menuBar.add(mnUtilidades);
		
		mnConfiguracinoes = new JMenuItemPersonalizado();
		mnConfiguracinoes.setText("Configuraciones");
		mnUtilidades.add(mnConfiguracinoes);
		contentPane = new JPanelPantallaPrincipal();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnClientes = new JButonPantallaPrincipal();
		btnClientes.setText("Clientes");
		btnClientes.setBounds(46, 87, 118, 114);
		contentPane.add(btnClientes);
		
		btnProductos = new JButonPantallaPrincipal();
		btnProductos.setText("Productos");
		btnProductos.setBounds(223, 87, 118, 114);
		contentPane.add(btnProductos);
		
		btnVentas = new JButonPantallaPrincipal();
		btnVentas.setText("Ventas");
		btnVentas.setBounds(407, 87, 118, 114);
		contentPane.add(btnVentas);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanelPantallaPrincipal getContentPane() {
		return contentPane;
	}

	public JMenuItemPersonalizado getMnCategorias() {
		return mnCategorias;
	}

	public JMenuItemPersonalizado getMnClientes() {
		return mnClientes;
	}

	public JMenuItemPersonalizado getMnFuncionarios() {
		return mnFuncionarios;
	}

	public JMenuItemPersonalizado getMnMarcas() {
		return mnMarcas;
	}

	public JMenuItemPersonalizado getMnProductos() {
		return mnProductos;
	}

	public JMenuItemPersonalizado getMnVentas() {
		return mnVentas;
	}

	public JMenuItemPersonalizado getMnListadoCategorias() {
		return mnListadoCategorias;
	}

	public JMenuItemPersonalizado getMnListadoClientes() {
		return mnListadoClientes;
	}

	public JMenuItemPersonalizado getMnListadoFuncoinarios() {
		return mnListadoFuncoinarios;
	}

	public JMenuItemPersonalizado getMnListadoMarcas() {
		return mnListadoMarcas;
	}

	public JMenuItemPersonalizado getMnListadoProductos() {
		return mnListadoProductos;
	}

	public JMenuItemPersonalizado getMnListadoVentas() {
		return mnListadoVentas;
	}

	public JMenuItemPersonalizado getMnConfiguracinoes() {
		return mnConfiguracinoes;
	}

	public JButonPantallaPrincipal getBtnClientes() {
		return btnClientes;
	}

	public JButonPantallaPrincipal getBtnProductos() {
		return btnProductos;
	}

	public JButonPantallaPrincipal getBtnVentas() {
		return btnVentas;
	}
	
	
}
