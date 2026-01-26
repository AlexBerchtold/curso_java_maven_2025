package com.cursojava.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cursojava.util.HibernateUtil;

public class GenericDao<T> {

	protected Class<T> clase;

	public GenericDao(Class<T> clase) {
		super();
		this.clase = clase;
	}

	// Usa el contexto actual para abrir la sessión
	protected Session getSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}

	// Metodo guardar que inserta en la base de datos
	public void guardar(T entity) throws Exception {
		try (Session session = getSession()) {
			Transaction transaccion = session.beginTransaction();
			try {
				session.merge(entity);
				transaccion.commit();
			} catch (Exception e) {
				if (transaccion != null)
					transaccion.rollback();
				throw e;
			}
		}
	}

	// Metodo que elimina los datos de la base de datos
	public void eliminar(T entity) throws Exception {
		try (Session session = getSession()) {
			Transaction transaccion = session.beginTransaction();
			try {
				session.remove(session.contains(entity) ? entity : session.merge(entity));
				transaccion.commit();
			} catch (Exception e) {
				if (transaccion != null)
					transaccion.rollback();
				throw e;
			}
		}
	}
	
	
	// Buscar una entidad por su ID en la base de datos
	public T recuperarPorId(Long id) {
		try (Session session = getSession()){
			return session.find(clase, id);
		}
	}
	
	
	public List<T> recuperarTodo(){
		try (Session session = getSession()){
			String hql = "FROM "+clase.getName()+ " e ORDER BY e.id";
			Query<T> query = session.createQuery(hql, clase);
			return query.getResultList();
		}
	}
	
	
	// Truncar la basa de datos
	public void truncarTabla(String tabla) {
		try (Session session = getSession()){
			Transaction transaccion = session.beginTransaction();
			try {
				session.createNativeMutationQuery("TRUNCATE TABLE "+tabla+" CASCADE").executeUpdate();
				transaccion.commit();
			} catch (Exception e) {
				if (transaccion != null)
					transaccion.rollback();
				throw e;
			}
		}
	}
	

}
