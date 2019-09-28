package com.atc.dto;

import java.util.List;

public class TeamMembersDTO {

	private String region;
	
	private List<MembersDTO> members;

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
	 * @return the members
	 */
	public List<MembersDTO> getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(List<MembersDTO> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "TeamMembersDTO [region=" + region + ", members=" + members + "]";
	}
	
	
}
