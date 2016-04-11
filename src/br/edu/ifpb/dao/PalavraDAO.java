package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.edu.ifpb.entidade.Palavra;
import br.edu.ifpb.hibernate.HibernateUtil;

public class PalavraDAO extends GenericDAO<Integer, Palavra> {

	private static PalavraDAO instance;
	
	public static PalavraDAO getInstance() {	
		
		instance = new PalavraDAO();		
		return instance;
	}

	@Override
	public List<Palavra> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return getAll("Pessoa.getAll");
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return Palavra.class;
	}

	@Override
	public Palavra find(Palavra entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Palavra getByKeyAuth(String keyAuth) throws HibernateException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Palavra palavra = null;
		
		try {
			
			String hql = "from Palavra as p"
					+ " where p.keyAuth = :keyAuth";
			
			Query query = session.createQuery(hql);
			query.setParameter("keyAuth", keyAuth);			
			
			palavra = (Palavra) query.uniqueResult();
	        
		} catch (HibernateException hibernateException) {
			
			session.getTransaction().rollback();
			
			throw new HibernateException(hibernateException);
			
		} finally {
		
			session.close();
		}
		
		return palavra;
	}

}