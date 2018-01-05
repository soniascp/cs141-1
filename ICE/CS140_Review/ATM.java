// Team ARC
// Cassi Lam, Angela Kwok, Raoul Soans
// CS141 Section 1
// Winter 2018

import java.util.Scanner;
import java.io.*;

/**
 * ATM- This program allows the user to check their balance, make a deposit, 
 * and withdraw money.
 *
 * 1.) Asks user to input the name of the file that contains their balance
 * 2.) If the file does not exist, terminate the program.
 * 3.) If the file exists, ask the user whether they'd like to withdraw or 
 *     deposit money into their account
 * 4.) If the user wants to withdraw, ensure that the amount they want to 
 *     withdraw is of equal or less value of their balance
 *
 */

public class ATM 
{
   public static void main(String[] args) throws IOException 
   {
      // Asks user to input the name of the file that contains their balance
      Scanner kb = new Scanner(System.in);
      System.out.print("Welcome! Please enter your filename: ");
      String filename = kb.nextLine();
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      // If the file does not exist, terminate the program.
      if (!file.exists())
      {
         System.out.print("File does not exist.");
         System.exit(0);
      }
      
      double balance = 0;
      while (inputFile.hasNextDouble())
         balance = inputFile.nextDouble();
      
      /*
        If the file exists, ask the user whether they'd like to withdraw or 
        deposit money into their account
      */
 
      System.out.println("Select a transaction: ");
      System.out.println("1 - Balance Inquiry\n2 - Withdraw Cash\n" + 
                         "3 - Make A Deposit\n4 - Exit");
      int transaction = kb.nextInt();
      switch (transaction)
      {
         case 1:
            System.out.println("Available balance: " + balance);
            System.out.print("Insert 2 to Withdraw Cash, 3 to Make A Deposit, or 4 to Exit.");
         case 2:
            System.out.print("Deposit. Enter an amount: ");
      }            
   }
   /*
    * TODO: If the user wants to withdraw, ensure that the amount they want to 
      withdraw is of equal or less value of their balance
    */
 
}
