package com.cursojava.componentes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class JLabelPersonalizado extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JLabelPersonalizado(String text) {
		super();
		setFont(new Font("Segoe UI", Font.BOLD, 13));
		setHorizontalAlignment(RIGHT);
		setMinimumSize(new Dimension(30,18));
		setText(text);
	}
	
	

}
