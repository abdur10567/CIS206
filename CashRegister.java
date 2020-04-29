/*
File:CashRegister.java
Description: CashRegister class that is instantiated to create CashRegister objects. It has various methods that are accessible from outside the class to add items, clear the register and get information about the register.
Created: Tuesday April 28 2020 6:20 pm
Author: Abdur Rahman
email: abdur4405@student.vvc.edu
*/


import java.lang.StringBuffer; //For StringBuffer to format int to a currency
import java.util.ArrayList; // To create Integer ArrayList

/**
   A simulated cash register that tracks the item count and
   the total amount due.
*/

public class CashRegister
{
	//create a list to hold the prices.
	private ArrayList<Integer> pricesArrayList = new ArrayList<Integer>();
   /**
      Constructs a cash register with no sales.
   */
   public CashRegister() 
   {
	   //empty constructor
   }
   /**
      Clears this cash register.
   */
   public void clear() 
   {
      pricesArrayList.clear();
   }

   /**
      Adds an item to this cash register.
      @param price the price of the added item
   */
   public void addItem(double price)
   {
	   //Convert double price to int without rounding
	   //to avoid the rounding process, convert price to string first
		String priceString = String.format("%.2f", price);
	   //remove the period
		priceString = priceString.replace(".", "");
	   //convert String to int
	   int priceInt = Integer.parseInt(priceString);
	   //place priceInt into the ArrayList
	   pricesArrayList.add(priceInt);
   }

   /**
      Gets the price of all items in the current sale.
      @return the total amount
   */
   public String getTotal() 
   {
      	//total everything in the ArrayList
		int sum = 0;
		for(int x : pricesArrayList)
    		sum += x;
		String sumString = intToCurrencyString(sum);
		return ("Total : " + sumString);
   }
   /**
      Gets the number of items in the current sale.
      @return the item count
   */
   public int getCount() 
   {
	   //return the number of prices that have been added to to the arraylist to get number of items.
      return pricesArrayList.size(); 
   }



	// Method that will print out each item and its price
   public void displayAll()
   {
		//iterate through the arraylist to print out each item and price.
	   for(int i = 0; i < pricesArrayList.size(); i++)
	   {
		   System.out.println("Item " + (i+1) + ": " + intToCurrencyString(pricesArrayList.get(i)));
	   }	   
   }

   private String intToCurrencyString(int passedInt)
   {
	   //convert passedInt into a StringBuffer
		StringBuffer conversionStringBuffer = new StringBuffer(String.valueOf(passedInt));
		//Now format the String into a dollar value
		//first add $ to front of value
		conversionStringBuffer = conversionStringBuffer.insert(0, '$');
		//now add floating point
		conversionStringBuffer = conversionStringBuffer.insert(conversionStringBuffer.length()-2, '.');
		//convert the StringBuffer to a normal String
		String conversionString =  conversionStringBuffer.toString();
		//return the string
		return conversionString;
   }
}
