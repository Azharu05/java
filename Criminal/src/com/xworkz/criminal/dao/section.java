package com.xworkz.criminal.dao;

import com.xworkz.criminal.dto.CriminalDTO;

public class section implements CriminalDAO {
	
	@Override
	public boolean save (CriminalDTO dto) {
		System.out.println("running save method ");
		return true;
	}

}
