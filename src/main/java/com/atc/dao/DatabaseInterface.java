package com.atc.dao;

import java.util.List;

import com.atc.model.Projects;

public interface DatabaseInterface {

	public List<Projects> getAllProjects() throws Exception;
	public void createProject(com.atc.dto.Projects Project) throws Exception;
	public Boolean updateProject() throws Exception;
	public Boolean deleteProject() throws Exception;
}
