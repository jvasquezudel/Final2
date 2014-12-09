package Question1;

public class Person {
	
	private String FirstName;
	
	private String LastName;
	
	private int ID;
	
	public void First(String FirstName)
	{
		this.FirstName = FirstName;
	}
	
	public void Last(String LastName)
	{
		this.LastName = LastName;
	}
	
	public void ID(int ID)
	{
		this.ID = ID;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getID() {
		return ID;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setID(int id) {
		ID = id;
	}

	
}
