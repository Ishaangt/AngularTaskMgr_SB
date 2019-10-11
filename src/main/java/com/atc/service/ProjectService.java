package com.atc.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atc.dto.ProjectsDTO;
import com.atc.dto.TeamMembersDTO;
import com.atc.dto.TeamMembersSummaryDTO;

@Component
public interface ProjectService {

	public List<ProjectsDTO> getAllProjects() throws Exception;

	public void createProject(ProjectsDTO Project) throws Exception;

	public void updateProject(ProjectsDTO Project) throws Exception;

	public void deleteProject(Integer id) throws Exception;

	public List<TeamMembersDTO> getAllTeamMembers() throws Exception;
	
	public List<TeamMembersSummaryDTO> getAllTeamMembersSummary() throws Exception;
}
