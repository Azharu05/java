package com.xworkz.criminal.dao;

public class CriminalCrime {
	private CriminalDAO dao;
	
	public CriminalCrime(CriminalDAO dao) {
		super();
		this.dao=dao;
	}
	
	public void validateAndSave(CriminalDTO dto) {
		if(dto ! =null) {
				if(dto.getID() > 0 && dto.getName ().length() > 3 && dto.getJailName().length() <50) {
					if(dto.getImprisonment() > 0 && dto.getJailName().length() > 12 &&dto.getJailName){
					
					boolean a=dao.save (dto);
					System.out.println("Criminalname is " + " " +dto);
					System.out.println(a);
				}
			}
		}
	}

}
