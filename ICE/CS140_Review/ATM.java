// Team ARC
// Cassi Lam, Angela Kwok, Raoul Soans
// CS141 Section 1
// Winter 2018

import java.util.Scanner;
import java.io.*;

public class ATM 
{
   public static void main(String[] args) throws IOException 
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Welcome! Please enter your filename: ");
      String filename = kb.nextLine();
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      if (!file.exists())
      {
         System.out.print("File does not exist.");
         System.exit(0);
      }
      
      double balance = 0;
      while (inputFile.hasNextDouble())
         balance = inputFile.nextDouble();
 
      System.out.println("Select a transaction: ");
      System.out.println("1 - Balance Inquiry\n2 - Withdraw Cash\n3 - Make A Deposit\n4 - Exit");
      int transaction = kb.nextInt();
      switch (transaction)
      {
         case 1:
            System.out.println("Available balance: " + balance);
            System.out.print("Insert 2 to Withdraw Cash, 3 to Make A Deposit, or 4 to Exit.");
         case 2:
                        
      }            
   }
}
