package com.cg.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.customer.model.CustomerBean;



@Repository
@Transactional
public class CustomerDaoImpl {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	public CustomerBean addCustomer(CustomerBean customer)
	{
		entityManager.persist(customer);
		return customer;
	}
	
	public CustomerBean getCustomerById(int custId) {
		CustomerBean customer = entityManager.find(CustomerBean.class, custId);
		return customer;
	}
	
	
	

	public CustomerBean getCustomerByCustId(int no) {
		CustomerBean customer = entityManager.find(CustomerBean.class, no);
		return customer;

	}
	
	
	public List<CustomerBean> getAll() {
		Query query = entityManager.createNamedQuery("getAll");
		@SuppressWarnings("unchecked")
		List<CustomerBean> allList = query.getResultList();
		return allList;
	}
	
	
	
	
	public CustomerBean getCustomerByIdInfo(int id) {
		
			//CustomerBean customer = entityManager.find(CustomerBean.class, id);
			TypedQuery<CustomerBean> query = entityManager.createNamedQuery("getById", CustomerBean.class).setParameter("custIdd", id);
			CustomerBean customer = query.getSingleResult(); 
			return customer;
		}
	
	
	
	

	public void removeCustomer(int id) {
		Query query = entityManager.createNamedQuery("removeById");
		query.setParameter("custIdd", id);
		query.executeUpdate(); 
		
	}
	
		
	} 
	



	

	


