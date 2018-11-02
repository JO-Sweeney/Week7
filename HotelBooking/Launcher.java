package HotelBooking;

public class Launcher {

	public static void main(String [] args){
		
		Hotel h1 = new Hotel(101, "Hotel El Joseph");
		
		h1.display();
		h1.bookARoom();
		h1.display();
		h1.cancelRoom();
		h1.display();
	}
}
