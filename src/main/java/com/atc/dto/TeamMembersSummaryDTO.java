package com.atc.dto;

public class TeamMembersSummaryDTO {
	
	private String region;
	private Integer teamMemberCount;
	private Integer temporaryUnavailableMembers;
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
	@Override
	public String toString() {
		return "TeamMembersSummaryDTO [region=" + region + ", teamMemberCount=" + teamMemberCount
				+ ", temporaryUnavailableMembers=" + temporaryUnavailableMembers + "]";
	}
	
	

}
