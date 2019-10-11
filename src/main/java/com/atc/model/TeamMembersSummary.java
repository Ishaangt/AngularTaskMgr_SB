package com.atc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGION_SUMMARY")
public class TeamMembersSummary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7267530696578909791L;

	@Id
	@Column(name = "ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "TEAM_MEM_COUNT")
	private Integer teamMemberCount;
	
	@Column(name = "TMP_UNV_MEM")
	private Integer temporaryUnavailableMembers;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the teamMemberCount
	 */
	public Integer getTeamMemberCount() {
		return teamMemberCount;
	}

	/**
	 * @param teamMemberCount the teamMemberCount to set
	 */
	public void setTeamMemberCount(Integer teamMemberCount) {
		this.teamMemberCount = teamMemberCount;
	}

	/**
	 * @return the temporaryUnavailableMembers
	 */
	public Integer getTemporaryUnavailableMembers() {
		return temporaryUnavailableMembers;
	}

	/**
	 * @param temporaryUnavailableMembers the temporaryUnavailableMembers to set
	 */
	public void setTemporaryUnavailableMembers(Integer temporaryUnavailableMembers) {
		this.temporaryUnavailableMembers = temporaryUnavailableMembers;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TeamMembersSummary [id=" + id + ", region=" + region + ", teamMemberCount=" + teamMemberCount
				+ ", temporaryUnavailableMembers=" + temporaryUnavailableMembers + "]";
	}
	
}
