package com.CRUDoperation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "iplTeam")
public class IplTeam {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;
	private int tropies;
	private String captainName;
	
	
	
	@Override
	public String toString() {
		return "IplTeam [id=" + id + ", name=" + name + ", tropies=" + tropies + ", captainName=" + captainName
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getTropies()=" + getTropies()
				+ ", getCaptainName()=" + getCaptainName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTropies() {
		return tropies;
	}
	public void setTropies(int tropies) {
		this.tropies = tropies;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

}
