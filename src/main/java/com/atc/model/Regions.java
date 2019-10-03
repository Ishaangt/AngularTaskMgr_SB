package com.atc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="REGION")
public class Regions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -225609951997711838L;

	@Id
	@Column(name = "ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
    private List<Members> members;
	
	@Column(name = "REGION", length = 100)
	private String region;
	
	public Regions() {
		super();
	}
	

	/**
	 * @param id
	 * @param members
	 * @param region
	 */
	public Regions(Integer id, List<Members> members, String region) {
		super();
		this.id = id;
		this.members = members;
		this.region = region;
	}

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
	 * @return the members
	 */
	public List<Members> getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(List<Members> members) {
		this.members = members;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
