package com.atc.dao.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atc.dao.DatabaseInterface;
import com.atc.model.Members;
import com.atc.model.Projects;
import com.atc.model.Regions;

@Repository
public class DatabaseInterfaceImpl implements DatabaseInterface {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public SessionFactory sessionFactoryProvider() {
		return entityManagerFactory.unwrap(SessionFactory.class);
	}

	@Override
	public List<Projects> getAllProjects() throws Exception {
		Session session = sessionFactoryProvider().openSession();
		String hql = "FROM Projects";
		Query<Projects> query = session.createQuery(hql);

		List<Projects> results = query.list();
		session.close();
		return results;
	}

	@Override
	public void createProject(Projects Project) throws Exception {
		Session session = sessionFactoryProvider().openSession();
		session.save(Project);
		session.close();
	}

	@Override 
	public void updateProject(Projects Project) throws Exception { 
		Session session = sessionFactoryProvider().openSession();
		session.saveOrUpdate(Project);
		session.close(); 
	}

	@Override 
	public void deleteProject(Integer id) throws Exception { 
		Session session = sessionFactoryProvider().openSession();
		session.delete(id);
		session.close();
	}
	
	@Override
	public List<Regions> getAllTeamMembers() throws Exception {
		Session session = sessionFactoryProvider().openSession();
		String hql = "select m.id AS member_id, m.name as member_name, m.status as member_status, r.region as region from Regions r join r.members m";
		Query<?> query = session.createQuery(hql);
		List<?> regions = query.list();
		Object o = new Regions();
		o = regions.get(0);
		session.close();
		
		return null;
	}

}
