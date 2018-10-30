
import java.util.Scanner;

/**
 * 
 * 
 *
 */
public class MealReceipt
{

	public static void main(String[] args) 
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter the name of the Appetizer ");
	String appetizerStr = keyboard.nextLine();
    System.out.print("Please enter the price of the Appetizer ");
	String appetizerpriceStr = keyboard.nextLine();
	double appetizer = Double.parseDouble(appetizerpriceStr);
	System.out.print("Please Enter the name of the Entree ");
	String entreeStr = keyboard.nextLine();
	System.out.print("Please enter the price of the Entree ");
	String entreepriceStr = keyboard.nextLine();
	double entree = Double.parseDouble(entreepriceStr);
	System.out.print("Please enter the name of the dessert ");
	String dessertStr = keyboard.nextLine();
	System.out.print("Please enter the price of the dessert ");
	String dessertpriceStr = keyboard.nextLine();
	double dessert = Double.parseDouble(dessertpriceStr);
	System.out.print("Please enter the percent you would like to tip as a decimal ");
	String tipStr = keyboard.nextLine();
	double tip = Double.parseDouble(tipStr);
	
	
	System.out.print("The subtotal is " + entreepriceStr +" " + dessertpriceStr +" " + appetizerpriceStr +" " + tipStr);
    

	
	

	
	}

}
