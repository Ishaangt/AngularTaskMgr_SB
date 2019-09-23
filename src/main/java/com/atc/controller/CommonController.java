package com.atc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atc.dao.DatabaseInterface;
import com.atc.model.Projects;

/**
 * @author Ishaan.Gupta1
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CommonController {
	
	@Autowired
	DatabaseInterface dbInt;
	
	@GetMapping("/projects")
	public List<Projects> getAllProjects() throws Exception {
		List<Projects> response = dbInt.getAllProjects();
		System.out.println("GET Projects: " + response.toString());
		return response; 
	}
	
	@PostMapping("/projects")
	public ResponseEntity<Map<String, Object>> createProject() throws Exception{
		System.out.println("Post");
		return null; 
	}
	
	@PutMapping("/projects")
	public void updateProject() throws Exception{
		System.out.println("Put");
	}
	
	@DeleteMapping("/projects")
	public void deleteProject() throws Exception{
		System.out.println("DEL");
	}

}
