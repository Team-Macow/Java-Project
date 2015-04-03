/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dilani
 */

public class ListHouse implements Listable{
    
     
    private String lastName;
    private String firstName;
    private int lotNumber;
    private int price;
    private int squareFeet;
    private int bedRooms;
    
    public ListHouse(String lastName, String firstName, int lotNumber,
		int price, int squareFeet, int bedRooms )
		{
		this.lastName = lastName;
		this.firstName = firstName;
		this.lotNumber = lotNumber;
		this.price = price;
		this.squareFeet = squareFeet;
		this.bedRooms = bedRooms;
		}
    
                public Listable copy()
		
		{
		ListHouse result = new ListHouse(lastName, firstName, lotNumber, price,
		squareFeet, bedRooms);
		return result;
		}
                
                public String compareTo(Listable comp)
		{
			int result;
		ListHouse other = (ListHouse)comp;
		 result = this.lotNumber - other.lotNumber;
		
		if (result >0) {
			
			return "Greater";
			
		} else if (result <0) {
			
			return "Less";
	
		} else {
			
			return "Equal";
			
		} 		 
		
		}
                
                public String lastName()
		{
		return lastName;
		}
		public String firstName()
		{
		return firstName;
		}
		public int lotNumber()
		{
		return lotNumber;
		}
		public int price()
		{
		return price;
		}
		public int squareFeet()
		{
		return squareFeet;
		}
		public int bedRooms()
		{
		return bedRooms;
		}
    
}
