/*
File:Main.java
Description: The driver class that instantiates an object from CashRegister class. It adds a few items to a CashRegister and tests out the various public methods of the CashRegister class.
Created: Tuesday April 28 2020 6:20 pm
Author: Abdur Rahman
email: abdur4405@student.vvc.edu
*/

//test comment

public class Main 
{
	public static void main(String arg[]) 
	{
		//instantiate a CashRegister object from the class
	   	CashRegister register1 = new CashRegister();

		//use the addItem method to add a few items
		register1.addItem(1223.95);
		register1.addItem(2200.95);
		register1.addItem(2.50);
		register1.addItem(9.50);

		//test the displayAll method and see if it displays every item and its price.
		register1.displayAll();

		//test getTotal method to see if it gets the total price
		System.out.println(register1.getTotal());

		//test getCount method to see if it gets the number of items
		System.out.println("Total # of items : " + register1.getCount()); 

		//test the clear method
		register1.clear();
		System.out.println("Total # of items after clear : " + register1.getCount());
	}
}
