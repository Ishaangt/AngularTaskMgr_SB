package com.atc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atc.dao.DatabaseInterface;
import com.atc.dto.ProjectsDTO;
import com.atc.dto.TeamMembersDTO;
import com.atc.model.Projects;
import com.atc.model.Regions;
import com.atc.service.ProjectService;


@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	DatabaseInterface dbInt;
	
	@Override
	public List<ProjectsDTO> getAllProjects() throws Exception {
		List<Projects> prjList = dbInt.getAllProjects();
		ProjectsDTO prjDto = new ProjectsDTO();
		List<ProjectsDTO> response = new ArrayList<ProjectsDTO>();
		prjList.forEach(prj -> {
			prjDto.setProjectId(prj.getProjectId());
			prjDto.setProjectName(prj.getProjectName());
			prjDto.setDateOfStart(prj.getDateOfStart());
			prjDto.setTeamSize(prj.getTeamSize());
			response.add(prjDto);
		});
		System.out.println("GET Projects-Service: " + response.toString());
		return response;
	}

	
	@Override
	public void createProject(ProjectsDTO Project) throws Exception { 
		Projects prj = new Projects();
		prj.setDateOfStart(Project.getDateOfStart());
		prj.setProjectId(Project.getProjectId());
		prj.setProjectName(Project.getProjectName());
		prj.setTeamSize(Project.getTeamSize());
		dbInt.createProject(prj);
	}

	@Override 
	public void updateProject(ProjectsDTO Project) throws Exception { 
		Projects prj = new Projects();
		prj.setDateOfStart(Project.getDateOfStart());
		prj.setProjectId(Project.getProjectId());
		prj.setProjectName(Project.getProjectName());
		prj.setTeamSize(Project.getTeamSize());
		dbInt.updateProject(prj);
	}

	@Override 
	public void deleteProject(Integer id) throws Exception { 
		dbInt.deleteProject(id);
	}


	@Override
	public List<TeamMembersDTO> getAllTeamMembers() throws Exception {
		System.out.println("dbInt = " + dbInt);
		List<Regions> teamMembers = dbInt.getAllTeamMembers();
		List<TeamMembersDTO> teamMembersList = new ArrayList<TeamMembersDTO>();
		
		for(Regions teamMember : teamMembers) {
			//System.out.println();
		}
		
		for(int i = 0; i < teamMembers.size(); i++) {
			System.out.println(teamMembers.get(i));
			System.out.println(teamMembers.get(i).getId());
			System.out.println(teamMembers.get(i).getMembers());
			System.out.println(teamMembers.get(i).getRegion());
			
		}
		return teamMembersList;
	}
	
	
	 

}
