package Problem2Redo;


import java.util.Scanner;

	public class Menu {
		
		private Court squashCourt;
		private Scanner kboard;
		
		/*display options for:

		full timetable
		Add a member
		display members for a specific timeslot
		display bookings made for a specific type of member
		*/
		
		public Menu() {
			
			squashCourt = new Court();
			kboard = new Scanner(System.in);
			chooseMenu();
		}
		
		public void displayMenu() {
			System.out.println("\nPlease choose from the following:");
			System.out.println("1. Show all sessions");
			System.out.println("2. Book a court");
			System.out.println("3. Search a specific timeslot");
			System.out.println("4. Search bookings by member type");
			System.out.println("5. Exit");
		}
		
		public void chooseMenu() {
			boolean exit = false;
			
			while(!exit){
				
				displayMenu();
				
				int choice = kboard.nextInt();
				
				switch(choice){
					
					case 1:	
						squashCourt.showTimetable();
						break;
					case 2:
						squashCourt.bookSlot();
						break;
					case 3: 
						squashCourt.searchTimetableTime();
						break;
					case 4: 
						squashCourt.searchTimetableMember();
						break;
					case 5: 
						System.out.println("Bye!");
						exit = true;
						break;
					
				}
			}
			
			
			
		}

		
	
	
}
