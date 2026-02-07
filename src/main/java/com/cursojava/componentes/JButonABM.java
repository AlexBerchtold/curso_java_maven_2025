package com.cursojava.componentes;

import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JButonABM extends JButton {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JButonABM() {
		super();
		setSize(70, 70);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setFocusPainted(false);
		setFont(new Font("Segoe UI", Font.BOLD, 13));
	}

	@Override
	public void setText(String text) {
		setIcono(text);
		super.setText(text);
	}
	
	private void setIcono(String icono) {
		try {
			URL url = JButonABM.class.getResource("/icons/"+icono.toLowerCase().replace(" ", "")+"32.png");
			this.setIcon(new ImageIcon(url));
		} catch (Exception e) {
			System.err.println("No se econtro el icono /icons/"+icono+"64.png");
		}
	}

}
