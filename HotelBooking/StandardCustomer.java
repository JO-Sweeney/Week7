package HotelBooking;

import java.util.Scanner;

public class StandardCustomer extends Customer{
	
	protected String mName;
	protected String mEmail;
	
	//Empty constructor
	public StandardCustomer(){
		
	}
	
	//overloaded constructor
	public StandardCustomer(String name, String email){
		mName = name;
		mEmail = email;
	}
	
	public void display(){
		System.out.println("Details are "+mName+" "+mEmail);
	}
	
	public void getName(){
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter your name");
		mName = kboard.nextLine();
	}
	
	public void getEmail(){
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter your email address");
		mEmail = kboard.nextLine();
	}
}
