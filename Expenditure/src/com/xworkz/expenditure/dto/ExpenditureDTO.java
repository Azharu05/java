package com.xworkz.expenditure.dto;
import com.xworkz.expenditure.constant.ExpanditureMonthly;

public class ExpenditureDTO<expandatureMonthly, ExpandatureMonthly> {
	private double price;
	private double tax;
	private expandatureMonthly expandatureMonthly;
	private String spentOn;
	private String purchaserName;
	
	public ExpenditureDTO() {
		System.out.println("Created" + this.getClass().getSimpleName());
				
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public  double setTax() {
		return tax;
			}
	
	public void  getTax(double tax) {
		this.tax =tax;
	}
	
	public expandatureMonthly getExpandatureMonthly() {
		return expandatureMonthly;
	}
	
	public void setExpandatureMontly(expandatureMonthly expandatureMonthly) {
		this.expandatureMonthly = expandatureMonthly;
	}
	
	public String getSpentOn() {
		return spentOn;
	}
	
	public void setSpentOn(String spentOn) {
		this.spentOn =spentOn;
	}
	
	public String getPurchaserName() {
		return purchaserName;
	}
	
	public  void setPurchaserName() {
		this.purchaserName = purchaserName;
	}
	public void setPurchaserName(String string) {
		
		
	}
	
	
	
	
	

}
