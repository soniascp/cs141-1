// Team Rocket
// Cassi Lam, Sonia Carrillo, YoungJun Woo 
// Winter 2018

/**
 * The Customer class stores customer info.
 */

public class Customer
{
   private String name;
   private String streetAddress;
   private int phoneNumber;

   /**
    * Constructor
    * @param n The name of the customer
    * @param address The customer's address
    * @param number The customer's phone number
    */

   public Customer(String n, String address, int number)
   {
      name = n;
      streetAddress = address;
      phoneNumber = number;
   }
	
	/**
    * The setName method stores a value in the name field
	 * @param n The value to store in name
    */

	public void setName(String n)
	{
		name = n;
	}

	/**
	 * The setAddress method stores a value in the streetAddress field
	 * @param address The value to store in streetAddress
	 */

	public void setAddress(String address)
	{
		streetAddress = address;
	}

	/**
	 * The setNumber method stores a value in the phoneNumber field
	 * @param number The value to store in phoneNumber
	 */

	public void setNumber(int number)
	{
		phoneNumber = number;
	}

	/**
	 * The getName method returns a Customer object's name
	 * @return The value in the name field
	 */

	public String getName()
	{
		return name;
	}

	/**
	 * The getAddress method returns a Customer object's street address
	 * @return The value in the streetAddress field
	 */
	
	public String getAddress()
	{
		return streetAddress;
	}

	/**
	 * The getNumber method returns a Customer object's phone number
	 * @return The value in the phoneNumber field
	 */

	public int getNumber()
	{
		return phoneNumber;
	}
}

