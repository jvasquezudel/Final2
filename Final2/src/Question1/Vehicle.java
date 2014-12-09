package Question1;

import Question1.Person;

public abstract class  Vehicle{
	
	private String Name;
	
	private String Color;
	
	private String Owner;
	
	private int Weight;
	
	public void Name(String Name)
	{
		this.Name = Name;
	}
	
	public void Color(String Color)
	{
		this.Color = Color;
	}
	
	public void Owner(String Owner)
	{
		this.Owner = Owner;
	}
	
	public void Weight(int Weight)
	{
		this.Weight = Weight;
	}
	
	Person engine = new Person();
}