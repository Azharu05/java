package com.xworkz.criminal.dao;

import com.xworkz.criminal.dto.CriminalDTO;

public class CriminalCrime {
	private CriminalDAO dao;
	
	public CriminalCrime(CriminalDAO dao) {
		super();
		this.dao=dao;
	}
	
	public void validateAndSave(CriminalDTO dto) {
		if(dto!=null) {
			
				if(dto.getID() > 0 && dto.getjailtName().length() > 3 && dto.getjailName().length() <50) {
					if(dto.Imprisonment() > 0 && dto.getjailName().length() > 12 &&dto.getjailName){
					
					boolean a=dao.save(dto);
					System.out.println("Criminalname is " + " " +dto);
					System.out.println(a);
				}
			}
		}
	}

}
