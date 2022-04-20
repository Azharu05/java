package com.xworkz.criminal.dto;

public class CriminalDTO {
	private int id;
	private String name;
	private String offense;
	private int imprisonment;
	private String jailName;
	
	
	public CriminalDTO(int id, String name,String offense, int imprisonment, String jailName) {
		super();
		this.id =id;
		this.name= name;
		this.offense= offense;
		this.imprisonment = imprisonment;
		this.jailName= jailName;
	}
	
	public String toString() {
		
		return "CriminalDTO [id=" + id + ", name=" + name +", offense=" +", imprisonment=" +imprisonment +" "
				+ ", jailName=" + jailName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
	


