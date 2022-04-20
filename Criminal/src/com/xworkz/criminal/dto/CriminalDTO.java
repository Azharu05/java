package com.xworkz.criminal.dto;

public class CriminalDTO {
	private int id;
	private String name;
	private String offense;
	private int imprisonment;
	private String jailName;
	
	public CriminalDTO() {
		super();
		
	}
	public CriminalDTO(int id, String name,String offense, int imprisonment, String jailName) {
		super();
		this.id =id;
		this.name= name;
		this.offense= offense;
		this.imprisonment = imprisonment;
		this.jailName= jailName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
	}

}
