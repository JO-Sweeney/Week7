package HotelBooking;

import java.util.Scanner;

public class Room {
	
	private int mRoomNo;
	private Customer mOccupier;
	private boolean mAvailable;
	
	public Room(int roomNo, int floorNo){
		mRoomNo = (floorNo*100)+roomNo;
		mAvailable = true;
	}
	
	public void display(){
		
		System.out.println("Room Number: "+mRoomNo);
		if(mAvailable == true){
			System.out.println("Room is available");
		}else{
			mOccupier.display();
		}
	}
	
	public void bookRoom(){
		
		Scanner kboard = new Scanner(System.in);
		System.out.println("Room "+mRoomNo);
		
		if(mAvailable== true){
			
			System.out.println("Press 1. for standard customer");
			System.out.println("Press 2. for gold customer");
			System.out.println("Press 3. for employee");
			int choice = kboard.nextInt();
			
			if(choice == 1){
				Customer newPerson = new StandardCustomer();
				newPerson.getName();
				newPerson.getEmail();
				mAvailable = false;
				mOccupier = newPerson;
			}
			
			if(choice == 2){
				Customer newPerson = new GoldCustomer();
				newPerson.getName();
				newPerson.getEmail();
				mAvailable = false;
				mOccupier = newPerson;
			}
			
			if(choice == 3){
				EmployeeCustomer newPerson = new EmployeeCustomer();
				newPerson.getName();
				newPerson.setEmployeeNumber();
				mAvailable = false;
				mOccupier = newPerson;
			}
		}else{
			System.out.println("Sorry, room is booked");
		}
	}
	
	public void cancelRoom(){
		mAvailable = true;
		mOccupier = null;
		System.out.println("Room cancelled");
	}
	
	public int returnRoomNos(){
		return(mRoomNo);
	}


}
