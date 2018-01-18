/**
 * This program demonstrates the Customer class.
 */
import java.util.Scanner;

public class ComputerRepairDemo
{
	public static void main(String[] args)
	{
		// Ask user to enter their information (name, address, phone number)
      Scanner kb = new Scanner(System.in);
		System.out.println("Welcome! Please enter your information below.");
		System.out.print("Name (first and last): ")
		String name = kb.nextLine();
		System.out.print("Street Address: ");
		String streetAddress = kb.nextLine();		
		System.out.print("Phone Number: ");
		int phoneNumber = kb.nextInt();

		// Create a customer object
		Customer firstCustomer = 
			new Customer(name, streetAddress, phoneNumber);
			
	
	}
}
