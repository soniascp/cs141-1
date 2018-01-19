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
                //Ask user to enter the computer's information
		System.out.println("Enter your computer information below.");
		System.out.print("Make: ");
		String make = kb.nextLine();
		System.out.println("Model: ");
		String model = kb.nextLine();
		System.out.println("Year: ");
		int year = kb.nextInt();
	        
		//create computer object
		Computer oneComputer = new Computer(make, model, year);
		
		//ask user for labor time and computer cost based on chart
		
		System.out.println("How many hours will this project take: ");
		int workHours = kb.nextInt();
		System.out.println("How much does the computer cost: ");
		double computerCost = kb.nextDouble();
		double laborCost = (double)workHours * 40.00;
		
		double totalCost = laborCost + computerCost;
		System.out.printf("The total cost is $ %f /n", totalCost);
		
		Costs customerCost = new Costs(laborCost, computerCost, workHours);
		
		
	}
}
