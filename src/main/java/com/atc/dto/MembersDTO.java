package com.atc.dto;

public class MembersDTO {

	private Integer memberId;
	private String memberName;
	private String memberStatus;
	
	
	/**
	 * @return the memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	/**
	 * @return the memberStatus
	 */
	public String getMemberStatus() {
		return memberStatus;
	}
	/**
	 * @param memberStatus the memberStatus to set
	 */
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	@Override
	public String toString() {
		return "MembersDTO [memberId=" + memberId + ", memberName=" + memberName + ", memberStatus=" + memberStatus
				+ "]";
	}
	
}
