/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kosgallana
 */


public class ListHouse1 implements Listable{    
     
    private String lastName;
    private String firstName;
    private int lotNumber;
    private int price;
    private int squareFeet;
    private int bedRooms;
    
    public ListHouse1(String lastName, String firstName, int lotNumber,int price, int squareFeet, int bedRooms ){
		this.lastName = lastName;
		this.firstName = firstName;
		this.lotNumber = lotNumber;
		this.price = price;
		this.squareFeet = squareFeet;
		this.bedRooms = bedRooms;
    }
                                   
                               
                public String lastName(){
		return lastName;
		}
                
		public String firstName(){
		return firstName;
		}
                
		public int lotNumber(){
		return lotNumber;
		}
                
		public int price(){
		return price;
		}
                
		public int squareFeet(){
		return squareFeet;
		}
                
		public int bedRooms(){
		return bedRooms;
		}
    
}
