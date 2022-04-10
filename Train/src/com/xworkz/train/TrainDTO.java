package com.xworkz.train;


public class TrainDTO {
	private int id;
	private String number;
	private Type type;
	private String name;
	private String Startingpoint;
	private String destination;
	   public int getId() {
		   return id;
	   }
	   public void setId(int id) {
		   this.id=id;
	   }
	public String getNumber() {
		return number;
	}

	public void setnumber(String number) {
		this .number=number;
	}
	public Type getType() {
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getStartingpoint() {
		return Startingpoint;
	}
	public void setStartingpoint(String startingpoint) {
		this.Startingpoint=startingpoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "TrainDTO [id=" + id + ", number=" + number + ", type=" + type + ", name=" + name + ", startingpoint="
				+ Startingpoint + ", destination=" + destination + ", getId()=" + getId() + ", getNumber()="
				+ getNumber() + ", getType()=" + getType() + ", getName()=" + getName() + ", getStartingpoint()="
				+ getStartingpoint() + ", getDestination()=" + getDestination() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, number, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainDTO other = (TrainDTO) obj;
		return Objects.equals(name, other.name) && number == other.number && type == other.type;
	}
    
    
}
