package com.cursojava.componentes;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import com.cursojava.interfaces.InterfaceABM;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogABM extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextFieldPersonalizado tfBuscador;
	private InterfaceABM interfaceABM;
	private JButonABM btnbmNuevo;
	private JButonABM btnbmEditar;
	private JButonABM btnbmEliminar;
	private JButonABM btnbmCancelar;
	private JButonABM btnbmGuardar;
	private JPanel jPanelFormulario;

	/**
	 * Create the dialog.
	 */
	public JDialogABM() {
		
		setBounds(100, 100, 1080, 720);
		setModal(true);
		setLocationRelativeTo(this);
		getContentPane().setLayout(null);
		
		btnbmNuevo = new JButonABM();
		btnbmNuevo.setText("Nuevo");
		btnbmNuevo.setBounds(10, 22, 95, 80);
		getContentPane().add(btnbmNuevo);
		
		btnbmEditar = new JButonABM();
		btnbmEditar.setText("Editar");
		btnbmEditar.setBounds(115, 22, 95, 80);
		getContentPane().add(btnbmEditar);
		
		btnbmEliminar = new JButonABM();
		btnbmEliminar.setText("Eliminar");
		btnbmEliminar.setBounds(220, 22, 95, 80);
		getContentPane().add(btnbmEliminar);
		
		btnbmCancelar = new JButonABM();
		btnbmCancelar.setText("Cancelar");
		btnbmCancelar.setBounds(327, 22, 95, 80);
		getContentPane().add(btnbmCancelar);
		
		btnbmGuardar = new JButonABM();
		btnbmGuardar.setText("Guardar");
		btnbmGuardar.setBounds(432, 22, 95, 80);
		getContentPane().add(btnbmGuardar);
		
		jPanelFormulario = new JPanel();
		jPanelFormulario.setBorder(new LineBorder(SystemColor.scrollbar));
		jPanelFormulario.setBounds(10, 113, 516, 557);
		getContentPane().add(jPanelFormulario);
		jPanelFormulario.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(536, 113, 518, 557);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabelPersonalizado lblNewLabel = new JLabelPersonalizado("Buscador:");
		lblNewLabel.setBounds(537, 82, 85, 20);
		getContentPane().add(lblNewLabel);
		
		tfBuscador = new JTextFieldPersonalizado();
		tfBuscador.setBounds(632, 78, 422, 24);
		getContentPane().add(tfBuscador);
		tfBuscador.setColumns(10);

	}

	public void setInterfaceABM(InterfaceABM interfaceABM) {
		this.interfaceABM = interfaceABM;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTable getTable() {
		return table;
	}

	public JTextFieldPersonalizado getTfBuscador() {
		return tfBuscador;
	}

	public JButonABM getBtnbmNuevo() {
		return btnbmNuevo;
	}

	public JButonABM getBtnbmEditar() {
		return btnbmEditar;
	}

	public JButonABM getBtnbmEliminar() {
		return btnbmEliminar;
	}

	public JButonABM getBtnbmCancelar() {
		return btnbmCancelar;
	}

	public JButonABM getBtnbmGuardar() {
		return btnbmGuardar;
	}

	public JPanel getjPanelFormulario() {
		return jPanelFormulario;
	}
	
	public void setAcciones(){
		btnbmNuevo.addActionListener(this);
		btnbmEditar.addActionListener(this);
		btnbmEliminar.addActionListener(this);
		btnbmCancelar.addActionListener(this);
		btnbmGuardar.addActionListener(this);
		tfBuscador.setActionCommand("Buscar");
		tfBuscador.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Nuevo":
			interfaceABM.nuevo();
			break;
		case "Editar":
			interfaceABM.editar();
			break;
		case "Eliminar":
			interfaceABM.eliminar();
			break;
		case "Cancelar":
			interfaceABM.cancelar();
			break;
		case "Guardar":
			interfaceABM.guardar();
			break;
		case "Buscar":
			interfaceABM.buscar();
			break;
		case "Salir":
			interfaceABM.salir();
			break;
		}
		
	}
	
	
}
