package com.atc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ishaan.Gupta1
 *
 */
@Entity
@Table(name="PROJECTS")
public class Projects implements Serializable {

	private static final long serialVersionUID = -2633696164650618942L;

	@Id
	@Column(name="PROJECT_ID")
	private Integer projectId;
	
	@Column(name="PROJECT_NAME")
	private String projectName;
	
	@Column(name="DATE_OF_START")
	private Date dateOfStart;
	
	@Column(name="TEAM_SIZE")
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