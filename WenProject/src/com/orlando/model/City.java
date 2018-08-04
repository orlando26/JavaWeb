package com.orlando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Id_State")
	private Integer idState;

	@Column(name = "Name")
	private String name;

	@Column(name = "LastModified")
	private Date lastModified;
	
}
