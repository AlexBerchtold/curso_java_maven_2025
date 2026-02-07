package com.cursojava.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.cursojava.entidades.Funcionario;

public class ModeloTablaFuncionario extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnas = {"ID", "Nombres", "Apellidos", "Documento", "Estado"};
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void setLista(List<Funcionario> lista) {
		funcionarios = lista;
		fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		return funcionarios.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.length;
	}
	
	@Override
	public String getColumnName(int column) {
		return columnas[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		switch (columnIndex) {
			case 0: return funcionarios.get(rowIndex).getId();
			case 1: return funcionarios.get(rowIndex).getNombre();
			case 2: return funcionarios.get(rowIndex).getApellido();
			case 3: return funcionarios.get(rowIndex).getDocumento();
			case 4: return funcionarios.get(rowIndex).isEstado();
		}
		
		return null;
	}

}
