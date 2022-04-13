package com.xworkz.exceptions;

import com.xworkz.exception.WrongEmailExecption;

public class EmailRequest {
	
	   private String[] emails=new  String[20];
	   private int index=0;
	   public boolean addemail  (String  emailname) throws WrongEmailExecption
	   {
		   if(emailname!=null)
		   {
			   if((index<emails.length) )
			   {
				   if( emailname.contains("@") && ((emailname.endsWith(".com")||(emailname.endsWith(".org")||
					   (emailname.endsWith(".in"))))))
			   {
					   this.emails[index]=emailname;
				 System.out.println("the given mail is valid"); 
				 index++;
				 
			   }	   
			   else
			   {
				
				   System.out.println("not valid ");
				  throw new WrongEmailExecption();
			   }
				   
			   } 
			   else
			   {
				   throw new CanNotAddMoreThanTwentyEmail("cant not add more than 20 email");
			   }
		   }
		   return false;
		   
	   }

}
