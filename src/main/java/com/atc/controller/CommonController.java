package com.atc.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atc.dto.ProjectsDTO;
import com.atc.dto.TeamMembersDTO;
import com.atc.service.ProjectService;

/**
 * @author Ishaan.Gupta1
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CommonController {
	
	@Autowired
	ProjectService prjsrv;
	
	private static final Logger logger = LogManager.getLogger(CommonController.class);
	
	@GetMapping("/projects")
	public List<ProjectsDTO> getAllProjects() throws Exception {
		logger.info("GET::Projects");
		List<ProjectsDTO> response = prjsrv.getAllProjects();
		return response; 
	}
	
	@GetMapping("/projects/{id}")
	public ProjectsDTO getProject(@PathVariable("id")Integer id) throws Exception {
		logger.info("GET::Project");
		return null;
	}
	
	@PostMapping("/projects")
	public ResponseEntity<String> createProject(@Valid @RequestBody ProjectsDTO project) throws Exception {
		logger.info("POST::Projects");
		prjsrv.createProject(project);
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.CREATED);
		return response;
	}

	@PutMapping("/projects")
	public ResponseEntity<String> updateProject(@Valid @RequestBody ProjectsDTO project) throws Exception {
		prjsrv.updateProject(project);
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.OK);
		return response;
	}

	@DeleteMapping("/projects/{id}")
	public ResponseEntity<String> deleteProject(@PathVariable("id")Integer id) throws Exception {
		logger.info("DEL::Projects");
		prjsrv.deleteProject(id);
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/team/members")
	public List<TeamMembersDTO> getAllTeamMembers() throws Exception {
		logger.info("GET::Projects");
		List<TeamMembersDTO> response = prjsrv.getAllTeamMembers();
		return response; 
	}
	
	@GetMapping("/team/members/summary")
	public List<ProjectsDTO> getAllTeamMembersSummary() throws Exception {
		logger.info("GET::Projects");
		return null; 
	}
	 

}
