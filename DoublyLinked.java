
import java.util.*;
	
class Link {
      
    	public double dData;                
     	public Link next;  
	public Link prev;
                
	 Link(double d)

        {

            dData = d;
	    next = null;
	    prev = null;

        }  
	Link() {
		dData = 0;
		next = null;
		prev = null;
	}     


//set link
	public void setLink(Link l) {
		next = l;
	}
//set data
	public void setData( double d) {
		dData= d;
	}
// get link
	public Link getLink() {
		return next;
	}
//get data
	public double getData() {
		return dData;
	}

}  // end class Link

class DoublyLinked
   {
   	private Link first; 
	           

	public DoublyLinked()            
	{
         	first = null;
		
	}
      
	public void insertFirst(Link k) { /**insert first*/
		
			k.next= first;
			k.prev=null;
			first =k;
		
     	} 
 
	public void insertLast(Link k)     /** insert last*/
   	{
        	if(first == null)
			insertFirst(k);
		else {
			Link temp = first;
			while(temp.next!= null)
			{
				temp = temp.next;
			}
			if(temp==first) {
				first.next = k;
				k.prev = first; }
			else {
				temp.next = k;
				k.prev = temp;
			}
	       	    }
				
    	 }  
	public void insertAfter(Link k)    /**insert after*/
  	 {
  	  	Link temp = first;
		System.out.println(" enter the value after which, element should be inserted");
		Scanner sc = new Scanner(System.in);
		double key = sc.nextDouble();
		while(temp.next != null && temp.dData != key) {
			temp = temp.next;
		}
		if(temp.dData==key) {
			Link p = temp.next;
			temp.next.prev = k;
			temp.next = k;
			k.prev = temp;
			k.next = p;
		}		
    	 }  
	public boolean isEmpty()  /** check if List is Empty */
	{
		if(first == null)
			return true;
		else
		 	return false;
	}
	
		
	public Link removeFirst()   /**delete front */
  	 {
		Link temp = first;
		
        	first = first.next;
		first.prev = null;
		return temp;
     	}

	public Link removeLast()     /**delete last */
  	 {
		Link temp=new Link();
		Link curr = first;
		if(isEmpty())
			System.out.println("empty list");
		else {
			while(curr.next != null) {
	
				curr = curr.next;
			}
			if(curr==first)
					temp=removeFirst();
			else {
				temp = curr;
				curr.prev.next = null;
			}
		}
		return temp;
	}
    	 

	public Link removeAt()    /**delete at*/
  	 {
		Link temp=new Link();

         	if(isEmpty()) {
			System.out.println("empty list");
			}

		else {	
			System.out.print("enter the value to be deleted");
			Scanner sc = new Scanner(System.in);
			double pos = sc.nextDouble();

			Link curr = first;
			
			while(curr.next != null) {
				if(curr.dData == pos) {
					if(curr==first) {
						temp = removeFirst();
						break;
					}
					else { 
						temp =curr;
						curr.prev.next = curr.next;
						break;
					}
				}
				curr = curr.next;
				
			 }
			if(curr.dData==pos)
				temp = removeLast();
			} 
			return temp;	
    	 }
	public void display() throws Exception {       /**display*/
		Link temp =first;
		if(temp==null)
			throw new Exception("No nodes in list");
		else {
			System.out.println("\n Elements are :");
			while(temp.next!=null) {
				System.out.print(temp.getData()+" >>");
				temp = temp.next;
			}
			System.out.print(temp.getData()+" >>");
		}
	}
	public int count() {      /**count nodes*/
		Link temp = first;
		int c =1;
		while(temp.next!=null) {
			temp = temp.next;
			c++;
		}
		return c;
	}
	
 } 



