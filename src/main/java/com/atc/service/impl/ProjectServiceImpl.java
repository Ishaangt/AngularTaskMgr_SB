package com.atc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atc.dao.DatabaseInterface;
import com.atc.dto.MembersDTO;
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

/**
 * 
 * 
 * Data:  "Region": "North", "Members": [
	          {"ID": 1, "Name": "Soumyajyoti", "Status": "Available"},
	          {"ID": 1, "Name": "Pratik P", "Status": "Available"},
	          {"ID": 1, "Name": "Shubham Sharma", "Status": "Busy"},
	          {"ID": 1, "Name": "RajKiran", "Status": "Busy"}
	        ]
 */
	@Override
	public List<TeamMembersDTO> getAllTeamMembers() throws Exception {
		//List<Regions> teamMembers = dbInt.getAllTeamMembers();
		List<TeamMembersDTO> teamMembersList = new ArrayList<TeamMembersDTO>();
		TeamMembersDTO team = new TeamMembersDTO();
		List<MembersDTO> memList = new ArrayList<MembersDTO>();
		MembersDTO mem = new MembersDTO();
		
		// Team 1
		mem.setMemberId(1);
		mem.setMemberName("Ishaan G");
		mem.setMemberStatus("Available");
		memList.add(mem);
		team.setRegion("North");
		team.setMembers(memList);
		teamMembersList.add(team);
//		memList.clear();
		memList = new ArrayList<MembersDTO>();
		
		// Team 2
		mem = new MembersDTO();
		team = new TeamMembersDTO();
		mem.setMemberId(2);
		mem.setMemberName("Mayank W");
		mem.setMemberStatus("Available");
		memList.add(mem);
		team.setRegion("South");
		team.setMembers(memList);
		teamMembersList.add(team);
		memList = new ArrayList<MembersDTO>();

		// Team 3
		mem = new MembersDTO();
		team = new TeamMembersDTO();
		mem.setMemberId(3);
		mem.setMemberName("Amit M");
		mem.setMemberStatus("Available");
		memList.add(mem);
		team.setRegion("East");
		team.setMembers(memList);
		teamMembersList.add(team);
		memList = new ArrayList<MembersDTO>();
		
		// Team 4
		mem = new MembersDTO();
		team = new TeamMembersDTO();
		mem.setMemberId(4);
		mem.setMemberName("Rahul L");
		mem.setMemberStatus("Available");
		memList.add(mem);
		team.setRegion("West");
		team.setMembers(memList);
		teamMembersList.add(team);
		
		return teamMembersList;
	}
	
	 

}
