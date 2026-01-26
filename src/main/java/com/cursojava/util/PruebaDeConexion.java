package com.cursojava.util;

import com.cursojava.dao.CategoriaDao;
import com.cursojava.entidades.Categoria;

public class PruebaDeConexion {
	
	public static void main(String[] args) {
		System.out.println("--- INICIANDO PRUEBA DE HIBERNATE 7 -----");
		try {
			CategoriaDao dao = new CategoriaDao();
			
			Categoria categoria = new Categoria();
			categoria.setDescripcion("Categoria de prueba");
			categoria.setEstado(true);
			
			dao.guardar(categoria);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
