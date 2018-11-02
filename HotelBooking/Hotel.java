package HotelBooking;

import java.util.Scanner;

public class Hotel {

	private int mHotelNo;
	private String mHotelName;
	private Floor [] mFloors = new Floor [4];
	
	public Hotel(int num, String name){
		
		mHotelNo = num;
		mHotelName = name;
		
		Floor f1 = new Floor(1);
		Floor f2 = new Floor(2);
		Floor f3 = new Floor(3);
		Floor f4 = new Floor(4);
		
		mFloors[0] = f1;
		mFloors[1] = f2;
		mFloors[2] = f3;
		mFloors[3] = f4;
		
	}
	
	public void display(){
		System.out.println("Hotel name: "+mHotelName);
		for(int i = 0; i < mFloors.length; i++){
			mFloors[i].displayFloor();
		}
	}
	
	public void display(int floorNo){
		System.out.println("Hotel Name: "+mHotelName);
		mFloors[floorNo].displayFloor();
	}
	
	public void bookARoom(){
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please choose a floor to stay on");
		int floorChoice = kboard.nextInt();
		mFloors[floorChoice - 1].findRoomtoBook();
	}
	
	public void cancelRoom(){
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please choose the floor to cancel");
		int floorChoice = kboard.nextInt();
		mFloors[floorChoice - 1].findRoomtoCancel();
	}
	
}
