package com.cursojava.servicio;

import com.cursojava.dao.FuncionarioDao;
import com.cursojava.entidades.Funcionario;

public class FuncionarioServicio {
	
	private FuncionarioDao dao;

	public FuncionarioServicio() {
		super();
		dao = new FuncionarioDao();
	}
	
	public void guardar(Funcionario funcionario) {
		try {
			dao.guardar(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
