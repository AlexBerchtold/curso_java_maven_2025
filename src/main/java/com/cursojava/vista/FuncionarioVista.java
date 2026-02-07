package com.cursojava.vista;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

import com.cursojava.componentes.JDialogABM;
import com.cursojava.componentes.JLabelPersonalizado;
import com.cursojava.componentes.JTextFieldPersonalizado;
import com.cursojava.controlador.FuncionarioControlador;
import com.cursojava.util.FechaUtil;

import javax.swing.JCheckBox;

public class FuncionarioVista extends JDialogABM {

	private static final long serialVersionUID = 1L;
	private JTextFieldPersonalizado tfNombre;
	private JTextFieldPersonalizado tfApellido;
	private JTextFieldPersonalizado tfDocumento;
	private JTextFieldPersonalizado tfTelefono;
	private JTextFieldPersonalizado tfEmail;
	private JTextFieldPersonalizado tfDireccion;
	private JFormattedTextField tfFecha;
	private JTextFieldPersonalizado tfCargo;
	private JCheckBox chbEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioVista dialog = new FuncionarioVista();
					dialog.setUpControlador();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	private void setUpControlador(){
		new FuncionarioControlador(this);
	}

	/**
	 * Create the dialog.
	 */
	public FuncionarioVista() {
		
		JLabelPersonalizado lblprsnlzdNombre = new JLabelPersonalizado((String) null);
		lblprsnlzdNombre.setText("Nombre:");
		lblprsnlzdNombre.setBounds(10, 30, 101, 18);
		getjPanelFormulario().add(lblprsnlzdNombre);
		
		JLabelPersonalizado lblprsnlzdApellido = new JLabelPersonalizado((String) null);
		lblprsnlzdApellido.setText("Apellido:");
		lblprsnlzdApellido.setBounds(10, 70, 101, 18);
		getjPanelFormulario().add(lblprsnlzdApellido);
		
		JLabelPersonalizado lblprsnlzdDocumento = new JLabelPersonalizado((String) null);
		lblprsnlzdDocumento.setText("Documento:");
		lblprsnlzdDocumento.setBounds(10, 110, 101, 18);
		getjPanelFormulario().add(lblprsnlzdDocumento);
		
		JLabelPersonalizado lblprsnlzdTelefono = new JLabelPersonalizado((String) null);
		lblprsnlzdTelefono.setText("Telefono:");
		lblprsnlzdTelefono.setBounds(10, 150, 101, 18);
		getjPanelFormulario().add(lblprsnlzdTelefono);
		
		JLabelPersonalizado lblprsnlzdEmail = new JLabelPersonalizado((String) null);
		lblprsnlzdEmail.setText("Email:");
		lblprsnlzdEmail.setBounds(10, 190, 101, 18);
		getjPanelFormulario().add(lblprsnlzdEmail);
		
		JLabelPersonalizado lblprsnlzdDireccin = new JLabelPersonalizado((String) null);
		lblprsnlzdDireccin.setText("Dirección:");
		lblprsnlzdDireccin.setBounds(10, 230, 101, 18);
		getjPanelFormulario().add(lblprsnlzdDireccin);
		
		JLabelPersonalizado lblprsnlzdFechaRegistro = new JLabelPersonalizado((String) null);
		lblprsnlzdFechaRegistro.setText("Fecha Registro:");
		lblprsnlzdFechaRegistro.setBounds(10, 270, 101, 18);
		getjPanelFormulario().add(lblprsnlzdFechaRegistro);
		
		JLabelPersonalizado lblprsnlzdCargo = new JLabelPersonalizado((String) null);
		lblprsnlzdCargo.setText("Cargo:");
		lblprsnlzdCargo.setBounds(10, 310, 101, 18);
		getjPanelFormulario().add(lblprsnlzdCargo);
		
		JLabelPersonalizado lblprsnlzdEstado = new JLabelPersonalizado((String) null);
		lblprsnlzdEstado.setText("Estado:");
		lblprsnlzdEstado.setBounds(10, 350, 101, 18);
		getjPanelFormulario().add(lblprsnlzdEstado);
		
		tfNombre = new JTextFieldPersonalizado();
		tfNombre.setBounds(121, 27, 385, 21);
		getjPanelFormulario().add(tfNombre);
		
		tfApellido = new JTextFieldPersonalizado();
		tfApellido.setBounds(121, 67, 385, 21);
		getjPanelFormulario().add(tfApellido);
		
		tfDocumento = new JTextFieldPersonalizado();
		tfDocumento.setBounds(121, 107, 192, 21);
		getjPanelFormulario().add(tfDocumento);
		
		tfTelefono = new JTextFieldPersonalizado();
		tfTelefono.setBounds(121, 150, 192, 21);
		getjPanelFormulario().add(tfTelefono);
		
		tfEmail = new JTextFieldPersonalizado();
		tfEmail.setBounds(121, 187, 385, 21);
		getjPanelFormulario().add(tfEmail);
		
		tfDireccion = new JTextFieldPersonalizado();
		tfDireccion.setBounds(121, 227, 385, 21);
		getjPanelFormulario().add(tfDireccion);
		
		tfFecha = new JFormattedTextField(FechaUtil.getFormatoFecha());
		tfFecha.setBounds(121, 267, 93, 21);
		getjPanelFormulario().add(tfFecha);
		
		tfCargo = new JTextFieldPersonalizado();
		tfCargo.setBounds(121, 307, 385, 21);
		getjPanelFormulario().add(tfCargo);
		
		chbEstado = new JCheckBox("Activo");
		chbEstado.setBounds(117, 349, 97, 23);
		getjPanelFormulario().add(chbEstado);

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextFieldPersonalizado getTfNombre() {
		return tfNombre;
	}

	public JTextFieldPersonalizado getTfApellido() {
		return tfApellido;
	}

	public JTextFieldPersonalizado getTfDocumento() {
		return tfDocumento;
	}

	public JTextFieldPersonalizado getTfTelefono() {
		return tfTelefono;
	}

	public JTextFieldPersonalizado getTfEmail() {
		return tfEmail;
	}

	public JTextFieldPersonalizado getTfDireccion() {
		return tfDireccion;
	}

	public JFormattedTextField getTfFecha() {
		return tfFecha;
	}

	public JTextFieldPersonalizado getTfCargo() {
		return tfCargo;
	}

	public JCheckBox getChbEstado() {
		return chbEstado;
	}
	
	
}
