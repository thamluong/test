package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public void check(){

		List<Employee> list = sessionFactory.getCurrentSession().createQuery("from Employee").list();

		for(Employee emp : list)
			System.out.println("id = "+emp.getId() + "\n\t"+emp.getName()+" --- "+ emp.getSalary());
	}


	@Override
	public void update(Employee emp){
		sessionFactory.getCurrentSession().saveOrUpdate(emp);
	}
}
