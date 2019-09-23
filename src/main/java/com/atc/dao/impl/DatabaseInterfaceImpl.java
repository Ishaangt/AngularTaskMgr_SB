package com.atc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.atc.dao.DatabaseInterface;
import com.atc.model.Projects;

public class DatabaseInterfaceImpl implements DatabaseInterface{
	
	@Autowired
	private SessionFactory sessionFactory;

	private static Session session = null;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Projects> getAllProjects() throws Exception {
		session = sessionFactory.openSession();
		String hql = "FROM PROJECTS";
		Query<Projects> query = session.createQuery(hql);
		List<Projects> results = query.list();
		session.close();
		return results;
	}

	@Override
	public void createProject(com.atc.dto.Projects Project) throws Exception {
		System.out.println("Project: " + Project.toString());
		session = sessionFactory.openSession();
		session.save(Project);
		session.close();
	}

	@Override
	public Boolean updateProject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
