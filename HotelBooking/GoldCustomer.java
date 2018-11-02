package HotelBooking;

public class GoldCustomer extends StandardCustomer{
	
	protected double mDiscount;
	protected String mCategory;
	
	public void display(){
		System.out.println("Details are "+mName+" "+mEmail + " *" + mCategory);
	}
	
	public GoldCustomer(){
		super();
		mDiscount = 0.8;
		mCategory = "gold";
	}
	
	public double getDiscount(){
		return mDiscount;
	}
	
	
}
