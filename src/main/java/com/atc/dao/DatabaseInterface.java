package com.atc.dao;

import java.util.List;

import com.atc.model.Projects;
import com.atc.model.Regions;
import com.atc.model.TeamMembersSummary;

public interface DatabaseInterface {

	public List<Projects> getAllProjects() throws Exception;

	public void createProject(Projects Project) throws Exception;

	public void updateProject(Projects Project) throws Exception;

	public void deleteProject(Integer id) throws Exception;
	
	public List<Regions> getAllTeamMembers() throws Exception; 
	
	public List<TeamMembersSummary> getAllTeamMembersSummary() throws Exception;

}
