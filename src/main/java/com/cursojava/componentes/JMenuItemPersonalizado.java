package com.cursojava.componentes;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class JMenuItemPersonalizado extends JMenuItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JMenuItemPersonalizado() {
		super();
		setOpaque(false);
	}
	
	@Override
	public void setText(String text) {
		setIcono(text);
		super.setText(text);
	}
	
	private void setIcono(String icono) {
		try {
			URL url = JButonPantallaPrincipal.class.getResource("/icons/"+icono.toLowerCase().replace(" ", "")+"24.png");
			this.setIcon(new ImageIcon(url));
		} catch (Exception e) {
			System.err.println("No se econtro el icono /icons/"+icono+"24.png");
		}
	}

}
