/*
 * Write a return statement in place of the line marked TODO to make hashCode() consistent with equals(). 
 */

public class Person 
{
	private String firstName;
	private String lastName = "Bob";
	
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Person)) 
		{
			return false;
		}
		
		Person that = (Person) obj;
		return this.lastName.toUpperCase().equals(that.lastName.toUpperCase());
	}
	
	public int hashCode()
	{
		int hash = 17;
		if (lastName == null)
		{
			return hash;
		}
		
		hash *= lastName.length() * 31;
		return hash * (int) lastName.toUpperCase().charAt(0);
	}
}
