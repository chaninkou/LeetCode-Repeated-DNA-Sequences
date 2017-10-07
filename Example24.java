package example24;
import java.util.Scanner;
import java.util.*;
/*   
    Author: Chan In Kou
    Purpose: The Display show the palindromes
*/
public class Example24
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
	    //Declare variables
        int d1;
		int d2;
		int d3;
		int d4;
		int d5;
        
		//Prompt the user to enter a 5 digit number. (Your program must read the entire number, not digit by digit.)
        System.out.println("Enter a 5 digit number: ");
		int userDigit = in.nextInt();
		
		//calucation
		d1 = userDigit / 10000;
		d2 = userDigit / 1000 % 10;
		d3 = userDigit % 1000 / 100 % 10;
		d4 = userDigit % 10000 % 1000 % 100 / 10;
		d5 = userDigit % 10000 % 1000 % 100 % 10;

		//If the number entered is not 5 digits, display an error message to the user and exit the program
		if (userDigit >= 100000 || userDigit <=9999)
		{
		  System.out.println(userDigit + " is not a 5 digit number!");
		  System.out.println("Program will now exit!");
		  System.exit(1);
		}
		//If the number is a 5 digit number, then you must verify if the number is a palindrome or not.
		else if (d1 == d5 && d2 == d4)
	    {
          System.out.printf(userDigit + " is a palindrome!");
		}
        else 
		{
          System.out.printf(userDigit + " is not a palindrome");
		}
	} 
}