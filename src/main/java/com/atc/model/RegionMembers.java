package com.atc.model;

public class RegionMembers {

	/**
	 * 
	 */
	public RegionMembers() {
		super();
	}

	private Integer id;
	private String name;
	private String status;
	private String region;
	
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	
	@Override
	public String toString() {
		return "RegionMembers [id=" + id + ", name=" + name + ", status=" + status + ", region=" + region + "]";
	}
	
	
}
