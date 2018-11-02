package Problem2Redo;

import java.util.ArrayList;
import java.util.Scanner;

public class Court {
	
		private ArrayList <Timeslot> timetable;											//Arraylist to hold the timeslots (which include day, time, and player arraylist
		
		public Court() {
			
			timetable = new ArrayList<Timeslot>();										//Initialise above arraylist
			
		}
		
		//gets details to book a timeslot such as day, time etc and then decides if it can be booked 
		public void bookSlot(){
			
			Scanner kboard = new Scanner(System.in);
			System.out.println("Please enter the day you wish to book");
			String searchDay = kboard.next();
			System.out.println("Please enter the hour-long timeslot you wish to book (24 hour format)");
			int searchTime = kboard.nextInt();
			
			System.out.println("How many people are playing?");
			int playerNum = kboard.nextInt();
			
			if(timetable.isEmpty()){											//Timetable has no bookings, so immediately book time

				timetable.add(new Timeslot(searchDay, searchTime, playerNum));	//remember - booking details are asked/added in timeslot class
				System.out.println("Timeslot booked successfully!");
			}
			else{																//if there are bookings already
				for(int i = 0; i < timetable.size(); i++) {						//for each booking in timetable arraylist
					
					//if the day searched for is equal to any timetable arraylist index (object) returned day value or time value
					if(searchDay.equalsIgnoreCase(timetable.get(i).getDay()) && searchTime == timetable.get(i).getHour()){											//
						System.out.println("Sorry, that timeslot is booked"); //don't book it, just print the message
					
					}else{																 
						timetable.add(new Timeslot(searchDay, searchTime, playerNum));	//otherwise, book it
						System.out.println("Timeslot booked successfully!");
					}		
				}	
			}
		}
		
		//Shows all the details of any booking that has been made
		public void showTimetable() {
			if(timetable.isEmpty()){											//Timetable has no bookings, so don't do anything
				System.out.println("No timeslots are booked this week");
			}else{
				for(int i = 0; i < timetable.size(); i++) {						//for each booking
					
					String day = timetable.get(i).getDay();						//day is the retrieved value for the object return for getDay()
					int hour = timetable.get(i).getHour();						//Hour is the retrieved value for the object return for getHour()
					
					System.out.println("Day: "+day);							//Then print out the details for the above returns
					System.out.println("Hour: "+hour+":00");					
					
					ArrayList <Member> players = timetable.get(i).getPlayers(); 	//Then get a copy of the arrayList of players 
					
					for(int j = 0; j < players.size(); j++) {						//For every player in this copied arraylist
						
						String name = players.get(j).getName();						
						String number = players.get(j).getNumber();
						String category = players.get(j).getType();					//Get the details 
						
						System.out.println("\nName: "+name);
						System.out.println("Number: "+number);
						System.out.println("Category: "+category+" member");		//Print the details 
					}
				}
			}	
		}
		
		//Gives the booking information for a specific day/time
		public void searchTimetableTime(){
			Scanner kboard = new Scanner(System.in);
			
			System.out.println("Please enter the day you're searching the details for");
			String searchDay = kboard.next();
			System.out.println("Please enter the time you're searching the details for");
			int searchTime = kboard.nextInt();
			
			if(timetable.isEmpty()){
				System.out.println("No timeslots are booked this week.");
			}else{
				for(int i = 0; i < timetable.size(); i++) {				//for each timeslot
					
					//if the searched day and time are equal to any timeslot in the timetable
					if(searchDay.equalsIgnoreCase(timetable.get(i).getDay()) && searchTime == timetable.get(i).getHour()){
							
						ArrayList <Member> players = timetable.get(i).getPlayers();			//Get a copy of the player arraylist
						for(int j = 0; j < players.size(); j++) {							
							String name = players.get(j).getName();
							String number = players.get(j).getNumber();
							String category = players.get(j).getType();						//Get the details of each player
							
							System.out.println("Name: "+name);							
							System.out.println("Number: "+number);
							System.out.println("Category: "+category+" member");			//Print the details of each player
						}
					}
				}
			}		
		}
		
		
		//Will display the details of any booking that has a member of a certain category
		public void searchTimetableMember(){
			Scanner kboard = new Scanner(System.in);
			
			System.out.println("Please enter the type of membership category to see bookings for");
			String memberType = kboard.next();
			
			if(timetable.isEmpty()){
				System.out.println("No timeslots are booked this week");
			}else{
				for(int i = 0; i < timetable.size(); i++) {
					
					ArrayList <Member> players = timetable.get(i).getPlayers();
					for(int j = 0; j < players.size(); j++){
						if(players.get(j).getType().equalsIgnoreCase(memberType)){
							
							String day = timetable.get(i).getDay();
							int hour = timetable.get(i).getHour();
							System.out.println("Day: "+day);
							System.out.println("Hour: "+hour+":00");
							
							String name = players.get(j).getName();
							String number = players.get(j).getNumber();
							String category = players.get(j).getType();
							
							System.out.println("\nName: "+name);
							System.out.println("Number: "+number);
							System.out.println("Category: "+category+" member");
						}else{
							System.out.println("No bookings of that category found");
						}
					}
				}
			}	
		}


}
