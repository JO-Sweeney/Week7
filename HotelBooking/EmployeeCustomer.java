package HotelBooking;

import java.util.Scanner;

public class EmployeeCustomer extends GoldCustomer {
	
	private String mEmployeeNo;
	
	public EmployeeCustomer(){
		super();
		mDiscount = 0;
		mCategory = "Employee";
	}
	
	public void setEmployeeNumber(){
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter your employee number");
		mEmployeeNo = kboard.next();
	}
	
	public void display(){
		System.out.println("Details are "+mName+" "+mEmployeeNo + " *" + mCategory);
	}
	
	
	
}
