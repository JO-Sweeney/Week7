package Problem2Redo;

public abstract class Person {
	
	private String mName;
	
	public Person(String forename, String surname){
		mName = forename+" "+surname;
	}
	
	public String getName() {
		return mName;
	}
	
	
}
