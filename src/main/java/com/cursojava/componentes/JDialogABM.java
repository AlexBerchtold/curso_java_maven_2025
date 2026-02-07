package com.cursojava.componentes;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class JDialogABM extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextFieldPersonalizado textField;

	/**
	 * Create the dialog.
	 */
	public JDialogABM() {
		
		setBounds(100, 100, 1080, 720);
		setModal(true);
		setLocationRelativeTo(this);
		getContentPane().setLayout(null);
		
		JButonABM btnbmNuevo = new JButonABM();
		btnbmNuevo.setText("Nuevo");
		btnbmNuevo.setBounds(10, 22, 95, 80);
		getContentPane().add(btnbmNuevo);
		
		JButonABM btnbmEditar = new JButonABM();
		btnbmEditar.setText("Editar");
		btnbmEditar.setBounds(115, 22, 95, 80);
		getContentPane().add(btnbmEditar);
		
		JButonABM btnbmEliminar = new JButonABM();
		btnbmEliminar.setText("Eliminar");
		btnbmEliminar.setBounds(220, 22, 95, 80);
		getContentPane().add(btnbmEliminar);
		
		JButonABM btnbmCancelar = new JButonABM();
		btnbmCancelar.setText("Cancelar");
		btnbmCancelar.setBounds(327, 22, 95, 80);
		getContentPane().add(btnbmCancelar);
		
		JButonABM btnbmGuardar = new JButonABM();
		btnbmGuardar.setText("Guardar");
		btnbmGuardar.setBounds(432, 22, 95, 80);
		getContentPane().add(btnbmGuardar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.scrollbar));
		panel.setBounds(10, 113, 516, 557);
		getContentPane().add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(536, 113, 518, 557);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabelPersonalizado lblNewLabel = new JLabelPersonalizado("Buscador:");
		lblNewLabel.setBounds(537, 82, 85, 20);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextFieldPersonalizado();
		textField.setBounds(632, 78, 422, 24);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}
