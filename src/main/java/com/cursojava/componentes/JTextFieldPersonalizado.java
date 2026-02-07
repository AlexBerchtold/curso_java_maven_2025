package com.cursojava.componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class JTextFieldPersonalizado extends JTextField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTextFieldPersonalizado() {
		super();
		setFont(new Font("Segoe UI", Font.PLAIN, 13));
		setDisabledTextColor(Color.GRAY);
	}
	
	

}
