package com.atc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "MEMBERS")
public class Members {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID",updatable = false, length = 11, nullable = false)
	private Integer id;
	
	@NotBlank
	@Column(name = "NAME")
	private String name;
	
	@NotBlank
	@Column(name = "STATUS")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID", referencedColumnName = "ID")
	private Regions region;

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
	public Regions getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Regions region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Members [id=" + id + ", name=" + name + ", status=" + status + ", region=" + region + "]";
	}
	
	
}
