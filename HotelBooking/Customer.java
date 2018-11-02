package HotelBooking;

abstract public class Customer {
	
	private String mName;
	private String mEmail;
	
	public abstract void display();
	
	public abstract void getName();
	
	public abstract void getEmail();
}
