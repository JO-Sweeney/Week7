package HotelBooking;
import java.util.Scanner;

public class Floor {
	
	private int mFloorNo;
	Room [] floorRooms = new Room [4];
	
	public Floor(int num){
		mFloorNo = num;
		Room room1 = new Room(1, mFloorNo);
		Room room2 = new Room(2, mFloorNo);
		Room room3 = new Room(3, mFloorNo);
		Room room4 = new Room(4, mFloorNo);
		
		floorRooms[0] = room1;
		floorRooms[1] = room2;
		floorRooms[2] = room3;
		floorRooms[3] = room4;
	}
	
	public void displayFloor(){
		System.out.println("Floor: "+mFloorNo);
		for(int i = 0; i < floorRooms.length; i++){
			floorRooms[i].display();
		}
	}
	
	public void findRoomtoBook(){
		Scanner kboard = new Scanner(System.in);
		boolean found = false;
		System.out.println("Please enter a room number to book");
		int num = kboard.nextInt();
		for(int i = 0; i < floorRooms.length; i++){
			if(num == floorRooms[i].returnRoomNos()){
				found = true;
				floorRooms[i].bookRoom();
				break;
			}
		}
		if(found == false){
			System.out.println("No such room number");
		}
	}
	
	public void findRoomtoCancel(){
		Scanner kboard = new Scanner(System.in);
		boolean found = false;
		System.out.println("Please enter a room number to cancel");
		int num = kboard.nextInt();
		for(int i = 0; i < floorRooms.length; i++){
			if(num == floorRooms[i].returnRoomNos()){
				found = true;
				floorRooms[i].cancelRoom();
				break;
			}
		}
		if(found == false){
			System.out.println("No such room number");
		}
	}
}
