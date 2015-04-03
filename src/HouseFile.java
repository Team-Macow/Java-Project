/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akeel
 * 
 */

import java.io.*;

public class HouseFile {
    
    private static BufferedReader reader;
	private static PrintWriter writer;
	private static boolean inStreamStatus = false;
	private static boolean outStreamStatus = false;
	private static String nextup =""; 
	
	public static void checkAvailability()
	{
		try {
			File sourcer = new File("house.txt"); 
			if(!sourcer.exists())
			sourcer.createNewFile();
			
	        } catch (Exception e) {
	        	System.out.println("Issue in "+e);
	                              }			
	}
	
	public static void reset()
	{
		try {
			
			if (inStreamStatus) reader.close();
			if (outStreamStatus) writer.close();
			reader = new BufferedReader(new FileReader("house.txt"));
			inStreamStatus = true;
			nextup = reader.readLine();
			
		} catch (IOException e) {
			System.out.println("Issue in "+e); 
		}
	
	}
	
	public static void rewrite()
	{
		try {		
			if (inStreamStatus) reader.close();
			if (outStreamStatus) writer.close();
			writer = new PrintWriter(new FileWriter("house.txt"));
			outStreamStatus = true;
			
		} catch (Exception e) {
			System.out.println("Issue in "+e); 
		}

	}
	
	public static boolean moreHouses()
	{
	if (!inStreamStatus || (nextup == null))
	return false;
	else return true;
	}
	
	public static ListHouse getNextHouse() 
	{
		String lastName = "lname";
		String firstName = "fname";
		int lotNumber = 0;
		int price = 0;
		int squareFeet = 0;
		int bedRooms =0;
		
		try {		
			lastName = nextup;
			firstName = reader.readLine();
			lotNumber = Integer.parseInt(reader.readLine());
			price = Integer.parseInt(reader.readLine());
			squareFeet = Integer.parseInt(reader.readLine());
			bedRooms = Integer.parseInt(reader.readLine());
			nextup = reader.readLine();			
		} catch (IOException e) {
			System.out.println("Issue in "+e); 
		}
		
		ListHouse house = new ListHouse(lastName, firstName, lotNumber, price,
		squareFeet, bedRooms);
		return house;

	}
	public static void putToFile(ListHouse house)
	{
		try {			
			writer.println(house.lastName());
			writer.println(house.firstName());
			writer.println(house.lotNumber());
			writer.println(house.price());
			writer.println(house.squareFeet());
			writer.println(house.bedRooms());
		} catch (Exception e) {
			System.out.println("Issue in "+e); 
		}

	}
	public static void close()
	{
		
		try {			
			if (inStreamStatus) reader.close();
			if (outStreamStatus) writer.close();
			inStreamStatus = false;
			outStreamStatus = false;
			
		} catch (IOException e) {
			System.out.println("Issue in "+e); 
		}

	}
	
    
}
