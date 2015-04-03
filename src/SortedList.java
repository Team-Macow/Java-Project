/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sanjaya
 */

public class SortedList {    
        private ListHouse house; 
	private SortedList next; 
	private SortedList starter; 
	private int numItems; 
	private SortedList currentPos; 
	
	
	  public SortedList()		
	  { 
		  numItems = 0;
		  starter = null;
		  currentPos = null;
	  } 
	

	
	  public void insert (ListHouse item) 
		 {
		    SortedList newNode = new SortedList(); 
		    SortedList backer = new SortedList(); 
		    SortedList pos = new SortedList(); 
		     
		      pos = starter;
			  backer = null;
			  boolean moreToSearch = (pos != null);

		    while (moreToSearch) 
		    {
		    	switch (item.compareTo(pos.house)) {
				case "Less":
					 moreToSearch = false;
					break;

				default:
					backer = pos;
					pos = pos.next;
					moreToSearch = (pos != null);
					break;
				}		    	

		    }
            
			  newNode.house = (ListHouse)item.copy();
			  if (backer == null)				  
			  {
			  newNode.next = starter;
			  starter = newNode;
			  }
			  else
			  {
			  newNode.next = pos;
	  		  backer.next = newNode;
			  }
//			  
			  numItems++;
			  System.out.println(currentPos);
		  }
	  
	  public void delete (ListHouse item)	 
	  {
		     SortedList pos = starter;
		     switch (item.compareTo(pos.house)) {
			case "Equal":
				starter = starter.next; 
				break;
			default:
				    while (!item.compareTo(pos.next.house).equalsIgnoreCase("Equal"))
					pos = pos.next;
					pos.next = pos.next.next;
				break;
			}
			numItems--;
			if(numItems ==0){flag = "o";}
			else{flag = "l";}
	  }
	  
	    String flag = "l";
		public Listable getNextItem ()
                { 
			
			System.out.println(currentPos);
			if(numItems ==1 && flag=="o")
			{                          
			if (currentPos.next == null)
			currentPos = starter;
			}
			Listable nextItem = currentPos.house.copy();
			if (currentPos.next == null)
			currentPos = starter;
			else
			currentPos = currentPos.next;
			return nextItem;
		}
		
		
		  public Listable Fetcher(ListHouse item)  
		  		  {
			  SortedList pos = starter;
			  boolean found = false;
			  while (!found)
			  {
			  if (item.compareTo(pos.house).equalsIgnoreCase("Equal")) 
			  found = true;
			  else
			  pos = pos.next;
			  }
			  return pos.house.copy();
		  }
		  
	
	public boolean availability(ListHouse item) {
		 
		  boolean moreToSearch;
		  SortedList pos = starter;
		  boolean found = false;
		  moreToSearch = (pos != null);
		  while (moreToSearch && !found)
		  {
		  switch (item.compareTo(pos.house)) {
			case "Equal":
				found = true;
				break;
				
			case "Less":
				moreToSearch = false;
				break;

			default:
				  pos = pos.next;
				  moreToSearch = (pos != null);
				break;
			}			
		}

		return found; 
	}

	  
	  public void reset()
	{
		  if(numItems != 0)
		  currentPos = starter;
	}
	  
	  public int lengthIs()
	
	{
	return numItems;
	}
	  
	  public SortedList getCurrent()
	  {
		  return currentPos; 
	  }
    
}
