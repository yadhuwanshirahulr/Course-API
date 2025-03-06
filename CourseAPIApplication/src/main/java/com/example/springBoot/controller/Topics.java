package com.example.springBoot.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topics {
	
	@Id
	String id;
	String name;
	String description;
	public Topics() {
		
	}
	public Topics(String id, String name, String description) {
		this.id = id;
		this.name  = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
