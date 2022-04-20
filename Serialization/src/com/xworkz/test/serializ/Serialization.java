package com.xworkz.test.serializ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Bike bike = new Bike("Goa",1065,250);
		byte[] bytes = convertObjectToBytes(bike);
		Bike bike1 = (Bike)	convertByteToObject(bytes);	
		
		System.out.println(bike1);
	}
	
	private static Object convertByteToObject(byte[] bytes)  {
		InputStream in=new ByteArrayInputStream(bytes);
		try (ObjectInputStream out=new ObjectInputStream(in))
		{
			return out;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return in; 
	}
		
	private static byte[] convertObjectToBytes(Bike bike) {
		ByteArrayOutputStream by= new ByteArrayOutputStream();
		try (ObjectOutputStream out=new ObjectOutputStream(by))
		{
			out.writeObject(out);
		}

		 catch (IOException out) {
			 out.printStackTrace();
			
		
		}
		return null;

	}

}
