package com.cursojava.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JButonPantallaPrincipal extends JButton {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JButonPantallaPrincipal() {
		super();
		setSize(new Dimension(140, 140));
		setFont(new Font("Segoe UI", Font.BOLD, 16));
		setForeground(new Color(44, 62, 80));
		setBackground(new Color(255, 255, 255, 180));
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setBorderPainted(false);
		setOpaque(true);
		setFocusable(false);
	}

	@Override
	public void setText(String text) {
		setIcono(text);
		super.setText(text);
	}
	
	private void setIcono(String icono) {
		try {
			URL url = JButonPantallaPrincipal.class.getResource("/icons/"+icono.toLowerCase().replace(" ", "")+"64.png");
			this.setIcon(new ImageIcon(url));
		} catch (Exception e) {
			System.err.println("No se econtro el icono /icons/"+icono+"64.png");
		}
	}

}
