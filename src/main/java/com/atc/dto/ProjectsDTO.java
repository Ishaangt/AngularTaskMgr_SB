package com.atc.dto;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProjectsDTO {
	
	@Id
	@NotBlank
	private Integer projectId;
	
	@NotBlank
	@Size(max = 255)
	private String projectName;
	
	@NotBlank
	private Date dateOfStart;
	
	@NotBlank
	private Integer teamSize;

	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the dateOfStart
	 */
	public Date getDateOfStart() {
		return dateOfStart;
	}

	/**
	 * @param dateOfStart the dateOfStart to set
	 */
	public void setDateOfStart(Date dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

	/**
	 * @return the teamSize
	 */
	public Integer getTeamSize() {
		return teamSize;
	}

	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", projectName=" + projectName + ", dateOfStart=" + dateOfStart
				+ ", teamSize=" + teamSize + "]";
	}
	

}
