package com.bus.service.imp;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.bus.domain.BusLocation;
import com.bus.service.interfaces.BusLocInter;
//配置@Transactional用处是让spring的事务管理器来管理
@Transactional
public class BusLocService implements BusLocInter {

	private SessionFactory sessionFactory;
	
	
	
	@Override
	public void addBusLoc(BusLocation b) {
		// TODO Auto-generated method stub
		
//		Session s=sessionFactory.openSession();
//		Transaction tx=s.beginTransaction();
//		s.save(b);
//		tx.commit();
		
		sessionFactory.getCurrentSession().save(b);
		
	}

	@Override
	public void showBusLoc(BusLocation b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delBusLoc(Serializable busid) {
		// TODO Auto-generated method stub
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
