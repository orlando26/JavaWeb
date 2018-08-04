package com.orlando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE")
public class State {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Abbrev")
	private String abbrev;

	@Column(name = "LastModified")
	private Date lastModified;

	
}
