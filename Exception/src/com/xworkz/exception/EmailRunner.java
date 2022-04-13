package com.xworkz.exception;

import com.xworkz.exception.WrongEmailExecption;
import com.xworkz.exceptions.CanNotAddMoreThanTwentyEmail;
import com.xworkz.exceptions.EmailRequest;

public class EmailRunner {

	public static void main(String[] args) {
		EmailRequest obj=new EmailRequest();
		try {
			obj.addemail("azharuyas@gmail.com");
			obj.addemail("Azharudhin.xworkz@gmail.com");
			obj.addemail("sam@gmail.com");
			obj.addemail("sutherlandglobal@gmail.com");
			obj.addemail("COVID19@gmail.com");
			obj.addemail("Vijay@gmail.com");
			obj.addemail("Arun@gmail.com");
			obj.addemail("karthick@gmail.com");
			obj.addemail("yaseer@gmail.com");
			obj.addemail("kalandhar@gmail.com");
			obj.addemail("spar@gmail.com");
			obj.addemail("preethi@gmail.com");
			obj.addemail("gayu@gmail.com");
			obj.addemail("Madhan@gmail.com");
			obj.addemail("babu@gmail.com");
			obj.addemail("sathish@gmail.com");
			obj.addemail("Akash@gmail.com");
			obj.addemail("ram@gmail.com");
			obj.addemail("jannai@gmail.com");
			obj.addemail("ajith@gmail.com");
			obj.addemail("harini@gmail.com");)
		}
		catch (WrongEmailExecption e) {
			e.printStackTrace();
		}
		
		catch ( CanNotAddMoreThanTwentyEmail e) {
			 e.printStackTrace();
		}

	}

}
