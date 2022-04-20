package com.xworkz.criminals;

import com.xworkz.criminal.dao.CriminalCrime;
import com.xworkz.criminal.dao.section;
import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.dao.CriminalDAO;

public class CriminalRunner {
	
	public static void main(String[] args) {
		CriminalDAO dao =new section();
		
		CriminalCrime service =new CriminalCrime(dao);
		
		CriminalDTO dto =new CriminalDTO();
		dto.setID(420);
		dto.setImprisonment(2);
		dto.setJailName("Prakash");
		dto.setName("Ravi");
		dto.setOffence("Accident");
		
		section.validateAndSave(dto);
	}
	
}
