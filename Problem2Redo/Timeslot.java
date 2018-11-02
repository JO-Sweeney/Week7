package Problem2Redo;

import java.util.ArrayList;
import java.util.Scanner;

public class Timeslot {
	
	private ArrayList <Member> mPlayers;								//Holds all the players for a timeslot
	private String mDay;												//The day that has been booked
	private int mHour;													//The time that has been booked
	
	public Timeslot(String day, int hour, int playerNum) {				
		
		mPlayers = new ArrayList<Member>();								//Initialise ArrayList for players
		mDay = day;														
		mHour = hour;
		for(int i = 0; i < playerNum; i++){								//Loop for number of players
			bookMember();
		}
	}
	
	public String getDay() {											
		return mDay;
	}
	
	public int getHour() {
		return mHour;
	}
	
	//Return the arraylist of players
	public ArrayList <Member> getPlayers(){								
		return mPlayers;
	}
	
	
	//Ask for the player details and add them to the player arraylist
	public void bookMember(){												
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter the first name of the player");
		String forename = kboard.next();
		System.out.println("Please enter the second name of the player");
		String surname = kboard.next();
		System.out.println("Please enter the player's membership number");
		String memberNo = kboard.next();
		System.out.println("Please enter the player's membership type");
		String memberCat = kboard.next();
		
		mPlayers.add(new Member(forename, surname, memberNo, memberCat));
	}
	

}
