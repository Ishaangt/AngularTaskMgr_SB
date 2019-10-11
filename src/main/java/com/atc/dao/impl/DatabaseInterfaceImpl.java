package com.atc.dao.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.util.ReflectHelper;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atc.dao.DatabaseInterface;
import com.atc.model.Members;
import com.atc.model.Projects;
import com.atc.model.Regions;
import com.atc.model.TeamMembersSummary;

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
		String hql = "FROM Regions";
		Query<Regions> query = session.createQuery(hql);
		List<Regions> regions = query.list();
		for(Regions reg : regions) {
			System.out.println(reg.getRegion());
			System.out.println(reg.getMembers());
		}
		session.close();
		
		return regions;
	}

	@Override
	public List<TeamMembersSummary> getAllTeamMembersSummary() throws Exception {
		Session session = sessionFactoryProvider().openSession();
		String hql = "FROM TeamMembersSummary";
		Query<TeamMembersSummary> query = session.createQuery(hql);
		List<TeamMembersSummary> results = query.list();
		session.close();
		return results;
	}

}
